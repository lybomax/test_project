package com.rm.export;

import cn.cbcc.elcs.core.common.export.bean.ExpExcelCfgUtil;
import cn.cbcc.elcs.core.common.export.cfg.CellStyleCfg;
import cn.cbcc.elcs.core.common.export.cfg.ExpExcelCfgDetail;
import cn.cbcc.elcs.core.common.export.cfg.ExpExcelElcsCfg;
import cn.cbcc.elcs.core.common.export.cfg.ExpExcelElcsCfgDet;
import cn.cbcc.elcs.core.exception.CoreException;
import cn.cbcc.elcs.core.model.IfsDataDic;
import cn.cbcc.elcs.core.system.ISystemService;
import cn.cbcc.elcs.core.util.ElcsCommonUtil;
import cn.cbcc.elcs.core.util.RspCode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.RegionUtil;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

/**
 * 生成excel通用处理
 * 
 * @author ningpeng
 *
 */
@Slf4j
@Component
@Data
public class GenExcelUtil {

	private static final String DDIC_FLG = "DDIC:";

	@Resource
	private ISystemService systemService;

	private static GenExcelUtil genExcelUtil;

	@PostConstruct
	public void init() {
		genExcelUtil = this;
	}

	private static void writeMergeCell(XSSFWorkbook wb, Sheet sheet, CellStyle cellStyle, Float rowHeight, int startRow, int endRow, int startCell, int endCell, Object cellValue, Map<String, String> fmtMap, Map<String, String> ddicTmpMap) {
		CellRangeAddress cellRange = new CellRangeAddress(startRow, endRow, startCell, endCell);
		sheet.addMergedRegion(cellRange);
		Row cellRow = sheet.createRow(startRow);
		if (rowHeight != null && rowHeight.intValue() > 0) {
			cellRow.setHeightInPoints(rowHeight.floatValue());
		}
		Cell cell = cellRow.createCell(startCell);
		cell.setCellStyle(cellStyle);
		writeCellValue(cell, null, cellValue, fmtMap, ddicTmpMap);
	}

	/**
	 * 生成excel
	 * 
	 * @param xlsxFile
	 * @param expIn
	 * @throws CoreException
	 */
	public static void genExcel(File xlsxFile, ExpExcelCfgDetail defConfig, ExpExcelElcsCfg elcsConfig, Map<String, Object> inMap) throws CoreException {
		ByteArrayOutputStream outputStream = null;
		try {
			outputStream = genExcel(defConfig, elcsConfig, inMap);
			byte[] byteArray = outputStream.toByteArray();
			FileUtils.writeByteArrayToFile(xlsxFile, byteArray);
		} catch (CoreException e) {
			throw e;
		} catch (Exception e) {
			log.error("", e);
			throw new CoreException(RspCode.SYSFAIL.getRspCode(), "生成Excel文件[" + xlsxFile.getName() + "]异常，" + e.getMessage());
		} finally {
			IOUtils.closeQuietly(outputStream);
		}
	}

	private static int mathFieldColspan(ExpExcelElcsCfg elcsConfig) {
		int colspan = 2;
		Map<String, ExpExcelElcsCfgDet> contentMap = elcsConfig.getContentMap();
		for(Entry<String, ExpExcelElcsCfgDet> entry:contentMap.entrySet()) {
			ExpExcelElcsCfgDet value = entry.getValue();
			int t = value.getFields().size();
			if (StringUtils.equalsIgnoreCase(value.getType(), "grid")) {
				if (t>colspan) {
					colspan = t;
				}
			}
		}
		int supr = colspan%2;
		if (supr>0) {
			colspan+=supr;
		}
		return colspan;
	}
	
	/**
	 * 生成excel
	 * 
	 * @param expIn
	 *            输入内容
	 * @throws CoreException
	 */
	public static ByteArrayOutputStream genExcel(ExpExcelCfgDetail defConfig, ExpExcelElcsCfg elcsConfig, Map<String, Object> inMap) throws CoreException {
		ExpExcelCfgDetail cfgDet = null;
		ExpExcelCfgDetail elcsConfigDet = elcsConfig.getConfig();
		if (elcsConfigDet == null) {
			cfgDet = defConfig;
		} else {
			cfgDet = elcsConfigDet;
		}
		// 数据字典缓冲
		Map<String, String> ddicTmpMap = new ConcurrentHashMap<String, String>();
		int maxCell = 0;
		int fieldColspan = ExpExcelCfgUtil.getIntCfg(cfgDet.getFieldColspan(), defConfig.getFieldColspan());
		if (fieldColspan<=0) {
			//自动计算列
			fieldColspan = mathFieldColspan(elcsConfig);
			log.info("采用自动计算表单列");
		}
		
		XSSFWorkbook wb = new XSSFWorkbook();
		String sheetName = elcsConfig.getSheetName();
		if (StringUtils.isBlank(sheetName)) {
			sheetName = elcsConfig.getTitle();
		}
		Sheet sheet = wb.createSheet(sheetName);
		Integer columnWidth = ExpExcelCfgUtil.getIntegerCfg(cfgDet.getColumnWidth(), defConfig.getColumnWidth());
		boolean columnAuto = true;
		if (columnWidth != null && columnWidth.intValue() > 0) {
			columnAuto = false;
			sheet.setDefaultColumnWidth(columnWidth.intValue());
		}
		// 写入总标题
		int endColumn = fieldColspan - 1;
		log.info("在【行[{}],列[{}]】写入标题:{}", "0-0", "0-" + endColumn, elcsConfig.getTitle());

		CellStyleCfg headTitleCellStyleCfg = ExpExcelCfgUtil.getCellStyleCfg(cfgDet.getTitleStyle(), defConfig.getTitleStyle());
		CellStyle headTitleCellStyle = headTitleCellStyleCfg.toCellStyle(wb);
		writeMergeCell(wb, sheet, headTitleCellStyle, headTitleCellStyleCfg.getRowHeight().floatValue(), 0, 0, 0, endColumn, elcsConfig.getTitle(), null, ddicTmpMap);
		boolean headSubTitle = ExpExcelCfgUtil.getBlCfg(cfgDet.getSubTitleFlg(), defConfig.getSubTitleFlg());
		if (headSubTitle) {
			// 写入导出日期
			String time = DateFormatUtils.format(Calendar.getInstance(), "yyyy-MM-dd HH:mm");
			log.info("在【行[{}],列[{}]】写入副标题:{}", "1-1", "0-" + endColumn, time);
			CellStyleCfg subHeadCellStyleCfg = ExpExcelCfgUtil.getCellStyleCfg(cfgDet.getTitleStyle(), defConfig.getTitleStyle());
			subHeadCellStyleCfg.setFontBold(false);
			subHeadCellStyleCfg.setBorder(false);
			subHeadCellStyleCfg.setFontSize(12);
			subHeadCellStyleCfg.setAlignment("right");
			CellStyle subHeadCellStyle = subHeadCellStyleCfg.toCellStyle(wb);
			writeMergeCell(wb, sheet, subHeadCellStyle, subHeadCellStyleCfg.getRowHeight().floatValue(), 1, 1, 0, endColumn, time, null, ddicTmpMap);
		}

		CellStyleCfg subTitleCellStyleCfg = ExpExcelCfgUtil.getCellStyleCfg(cfgDet.getSubTitleStyle(), defConfig.getSubTitleStyle());
		CellStyleCfg formLabelCellStyleCfg = ExpExcelCfgUtil.getCellStyleCfg(cfgDet.getFormLabelStyle(), defConfig.getFormLabelStyle());
		CellStyleCfg formValueCellStyleCfg = ExpExcelCfgUtil.getCellStyleCfg(cfgDet.getFormValueStyle(), defConfig.getFormValueStyle());

		CellStyleCfg tableTitleCellStyleCfg = ExpExcelCfgUtil.getCellStyleCfg(cfgDet.getTableTitleStyle(), defConfig.getTableTitleStyle());
		CellStyleCfg tableBodyCellStyleCfg = ExpExcelCfgUtil.getCellStyleCfg(cfgDet.getTableBodyStyle(), defConfig.getTableBodyStyle());
		// 开始写入内容
		Map<String, ExpExcelElcsCfgDet> contentMap = elcsConfig.getContentMap();
		int startRow = 2;

		for (Entry<String, ExpExcelElcsCfgDet> ctnEntry : contentMap.entrySet()) {
			String key = ctnEntry.getKey();
			Object inObj = inMap.get(key);
			ExpExcelElcsCfgDet value = ctnEntry.getValue();
			String type = value.getType();
			Map<String, String> fieldsFmt = value.getFieldsFmt();
			Map<String, String> valueForamt = defConfig.getValueForamt();
			Map<String, String> fmtMap = ExpExcelCfgUtil.getValueFmtMap(valueForamt, fieldsFmt);
			if (StringUtils.equalsIgnoreCase(type, "form")) {// 表单
				startRow = writeSubTitle(wb, sheet, startRow, fieldColspan - 1, value.getTitle(), subTitleCellStyleCfg, ddicTmpMap);
				startRow = writeForm(wb, sheet, startRow,fieldColspan, value, inObj, formLabelCellStyleCfg, formValueCellStyleCfg, fmtMap, ddicTmpMap);
			} else if (StringUtils.equalsIgnoreCase(type, "grid")) {// 表格
				int size = value.getFields().size();
				if (size > maxCell) {
					maxCell = size;
				}
				startRow = writeSubTitle(wb, sheet, startRow, size - 1, value.getTitle(), subTitleCellStyleCfg, ddicTmpMap);
				startRow = writeGrid(wb, sheet, startRow, value, inObj, tableTitleCellStyleCfg, tableBodyCellStyleCfg, fmtMap, ddicTmpMap);
			}
		}

		// 自动调整列宽
		if (columnAuto) {
			for (int i = 0; i < maxCell; i++) {
				sheet.autoSizeColumn((short) i);
			}
		}

		// 写入文件
		ByteArrayOutputStream bout = null;
		try {
			bout = new ByteArrayOutputStream();
			wb.write(bout);
			bout.flush();
			return bout;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new CoreException(RspCode.SYSFAIL.getRspCode(), "生成excel异常:" + e.getMessage());
		}
	}

	/**
	 * 写入子标题
	 * 
	 * @param wb
	 * @param sheet
	 * @param startRow
	 * @param subTitle
	 * @param cfg
	 * @return
	 */
	private static int writeSubTitle(XSSFWorkbook wb, Sheet sheet, int startRow, int endColumn, String subTitle, CellStyleCfg subTitleCellStyleCfg, Map<String, String> ddicTmpMap) {
		int rowIdx = startRow;
		if (StringUtils.isNotBlank(subTitle)) {
			log.info("在【行[{}],列[{}]】写入子标题:{}", startRow + "-" + startRow, "0-" + endColumn, subTitle);
			CellStyle cellStyle = subTitleCellStyleCfg.toCellStyle(wb);
			writeMergeCell(wb, sheet, cellStyle, subTitleCellStyleCfg.getRowHeight().floatValue(), startRow, startRow, 0, endColumn, subTitle, null, ddicTmpMap);
			rowIdx += 1;
		}
		return rowIdx;
	}

	/**
	 * 写入表格，返回结束后
	 * 
	 * @param wb
	 * @param sheet
	 * @param startRow
	 * @param grid
	 * @param cfg
	 * @return
	 * @throws CoreException
	 */
	private static int writeGrid(XSSFWorkbook wb, Sheet sheet, int startRow, ExpExcelElcsCfgDet gridCfgDet, Object inListObj, CellStyleCfg tableTitleCellStyleCfg, CellStyleCfg tableBodyCellStyleCfg, Map<String, String> fmtMap, Map<String, String> ddicTmpMap)
			throws CoreException {
		Map<String, String> fieldAndNameMap = gridCfgDet.getFields();
		int rowIdx = startRow;
		int cellIdx = 0;
		// 1.写入表格头
		CellStyle tableTitleCellStyle = tableTitleCellStyleCfg.toCellStyle(wb);
		Row row = sheet.createRow(rowIdx);
		for (Entry<String, String> entry : fieldAndNameMap.entrySet()) {
			Cell tableTitleCell = row.createCell(cellIdx);
			tableTitleCell.setCellStyle(tableTitleCellStyle);
			tableTitleCell.setCellValue(entry.getValue());
			cellIdx++;
		}
		// 2.写入表格内容
		CellStyle tableContentCellStyle = tableBodyCellStyleCfg.toCellStyle(wb);
		rowIdx++;
		List<?> inList = null;
		if (inListObj != null && inListObj instanceof List) {
			inList = (List<?>) inListObj;
		}
		if (inList!=null) {
			for (Object inObj : inList) {
				cellIdx = 0;
				row = sheet.createRow(rowIdx);
				for (Entry<String, String> entry : fieldAndNameMap.entrySet()) {
					Cell tableRowCell = row.createCell(cellIdx);
					tableRowCell.setCellStyle(tableContentCellStyle);
					if (StringUtils.isNotBlank(entry.getKey()) && inObj != null) {
						Object value = ElcsCommonUtil.getRefValue(inObj, entry.getKey());
						writeCellValue(tableRowCell, entry.getKey(), value, fmtMap, ddicTmpMap);
					}
					cellIdx++;
				}
				rowIdx++;
			}
		}
		return rowIdx;
	}

	/**
	 * 写入表单，返回结束行
	 * 
	 * @param startRow
	 * @param form
	 * @param cfg
	 * @return
	 * @throws CoreException
	 */
	private static int writeForm(XSSFWorkbook wb, Sheet sheet, int startRow, int colspan, ExpExcelElcsCfgDet formCfgDet, Object inObj, CellStyleCfg formLabelCellStyleCfg, CellStyleCfg formValueCellStyleCfg, Map<String, String> fmtMap, Map<String, String> ddicTmpMap)
			throws CoreException {
		Map<String, String> fieldAndNameMap = formCfgDet.getFields();
		int cellIdx = 0;
		int rowIdx = startRow;
		Row row = null;
		CellStyle labelCellStyle = formLabelCellStyleCfg.toCellStyle(wb);
		CellStyle valueCellStyle = formValueCellStyleCfg.toCellStyle(wb);
		int size = fieldAndNameMap.size();
		// 最后列合并
		int t = size * 2 % colspan;
		int lstColspan = 0;
		int tt = 0;

		for (Entry<String, String> entry : fieldAndNameMap.entrySet()) {
			if (cellIdx % colspan == 0) {
				row = sheet.createRow(rowIdx);
				if (formValueCellStyleCfg.getRowHeight() != null && formValueCellStyleCfg.getRowHeight().intValue() > 0) {
					row.setHeightInPoints(formValueCellStyleCfg.getRowHeight().floatValue());
				}
				rowIdx += 1;
				cellIdx = 0;
			}
			tt++;
			if (tt == size) {
				lstColspan = t > 0 ? (colspan - t + 1) : t;
			}
			String fieldKey = entry.getKey();
			String fieldLabel = entry.getValue();
			writeField(wb, sheet, row, cellIdx, fieldKey, fieldLabel, inObj, labelCellStyle, valueCellStyle, lstColspan, fmtMap, ddicTmpMap);
			cellIdx += 2;
		}
		if (cellIdx % colspan > 0) {
			rowIdx += 1;
		}
		return rowIdx;
	}

	/**
	 * 写入field
	 * 
	 * @param wb
	 * @param sheet
	 * @param row
	 * @param cellIdx
	 * @param fieldKey
	 * @param fieldLabel
	 * @param inObj
	 * @param cfg
	 * @param labelCellStyle
	 * @param valueCellStyle
	 * @throws CoreException
	 */
	private static void writeField(XSSFWorkbook wb, Sheet sheet, Row row, int cellIdx, String fieldKey, String fieldLabel, Object inObj, CellStyle labelCellStyle, CellStyle valueCellStyle, int lstColspan, Map<String, String> fmtMap, Map<String, String> ddicTmpMap)
			throws CoreException {
		int cell = cellIdx;
		Cell cellLabel = row.createCell(cell);
		cellLabel.setCellStyle(labelCellStyle);
		cellLabel.setCellValue(fieldLabel + ": ");
		cell++;
		Object value = null;
		if (StringUtils.isNotBlank(fieldKey) && inObj != null) {
			value = ElcsCommonUtil.getRefValue(inObj, fieldKey);
		}
		if (lstColspan > 0) {
			int end = cell + lstColspan - 1;
			CellRangeAddress cellRange = new CellRangeAddress(row.getRowNum(), row.getRowNum(), cell, end);
			sheet.addMergedRegion(cellRange);
			setBorderStyle(cellRange, sheet, wb);
		}
		Cell cellValue = row.createCell(cell);
		cellValue.setCellStyle(valueCellStyle);
		writeCellValue(cellValue, fieldKey, value, fmtMap, ddicTmpMap);
	}

	private static void setBorderStyle(CellRangeAddress region, Sheet sheet, XSSFWorkbook wb) {
		RegionUtil.setBorderBottom(CellStyle.BORDER_THIN, region, sheet, wb);// 下边框
		RegionUtil.setBorderLeft(CellStyle.BORDER_THIN, region, sheet, wb); // 左边框
		RegionUtil.setBorderRight(CellStyle.BORDER_THIN, region, sheet, wb); // 右边框
		RegionUtil.setBorderTop(CellStyle.BORDER_THIN, region, sheet, wb); // 上边框
	}

	private static void writeCellValue(Cell cell, String fieldNm, Object value, Map<String, String> fmtMap, Map<String, String> ddicTmpMap) {
		if (value != null) {
			if (value instanceof Integer) {
				int valueInt = (int) value;
				cell.setCellValue(valueInt);
			} else if (value instanceof Float) {
				float valueFloat = (float) value;
				cell.setCellValue(valueFloat);
			} else if (value instanceof BigDecimal) {
				BigDecimal bg = (BigDecimal) value;
				String fieldFmt = getFieldFmt(fieldNm, Integer.class.getName(), fmtMap);
				if (StringUtils.isNotBlank(fieldFmt)) {
					DecimalFormat formater = new DecimalFormat(fieldFmt);
					cell.setCellValue(formater.format(bg));
				} else {
					cell.setCellValue(bg.doubleValue());
				}
			} else if (value instanceof Date) {
				Date dt = (Date) value;
				String dateFmt = getFieldFmt(fieldNm, Integer.class.getName(), fmtMap);
				if (StringUtils.isNotBlank(dateFmt)) {
					cell.setCellValue(DateFormatUtils.format(dt, dateFmt));
				} else {
					cell.setCellValue(dt);
				}
			} else if (value instanceof Timestamp) {
				Timestamp tm = (Timestamp) value;
				String tmFmt = getFieldFmt(fieldNm, Integer.class.getName(), fmtMap);
				if (StringUtils.isNotBlank(tmFmt)) {
					cell.setCellValue(DateFormatUtils.format(tm, tmFmt));
				} else {
					cell.setCellValue(tm);
				}
			} else {
				String val = value.toString();
				int len = StringUtils.length(val);
				String fieldFmt = getFieldFmt(fieldNm, Integer.class.getName(), fmtMap);
				if (StringUtils.isNotBlank(fieldFmt) ) {
					if (StringUtils.startsWithIgnoreCase(fieldFmt, DDIC_FLG)) {// 数据字典
						val = getDDicValue(fieldFmt, val, ddicTmpMap);
					} else if (len == 8) {// 8位日期
						val = DateFormatUtils.format(ElcsCommonUtil.str2dt(val),fieldFmt);
					} else if (len == 14) {// 14位日期
						val = DateFormatUtils.format(ElcsCommonUtil.tm14dt(val), fieldFmt);
					}
				}
				cell.setCellValue(val);
			}
		} else {
			cell.setCellValue("");
		}
	}

	private static String getDDicValue(String fieldFmt, String value, Map<String, String> ddicTmpMap) {
		String dataTypeNo = StringUtils.trim(StringUtils.substring(fieldFmt, DDIC_FLG.length()));
		if (StringUtils.isNotBlank(dataTypeNo) && StringUtils.isNotBlank(value)) {
			String key = dataTypeNo+"-"+StringUtils.trim(value);
			String ddicValue = ddicTmpMap.get(key);
			if (StringUtils.isNotBlank(ddicValue)) {
				ddicTmpMap.put(key,ddicValue);
				return ddicValue;
			}else {
				List<IfsDataDic> list = genExcelUtil.getSystemService().getIfsDataDics(dataTypeNo);
				for (IfsDataDic ifsDataDic : list) {
					String t = dataTypeNo+"-"+ifsDataDic.getDataNo();
					ddicTmpMap.put(t,ifsDataDic.getDataName());
				}
				return ddicTmpMap.get(key);
			}
		}
		return value;
	}

	private static String getFieldFmt(String fieldNm, String valueClassNm, Map<String, String> fmtMap) {
		String fieldFmt = null;
		if (fmtMap!=null) {
			if (StringUtils.isNotBlank(fieldNm)) {
				fieldFmt = fmtMap.get(fieldNm);
			}
			if (StringUtils.isBlank(fieldFmt)) {
				fieldFmt = fmtMap.get(valueClassNm);
			}
		}
		return fieldFmt;
	}

	public static void main(String[] args) {
		BigDecimal bg = BigDecimal.ZERO;
		System.out.println(bg.getClass().getName());
	}

}
