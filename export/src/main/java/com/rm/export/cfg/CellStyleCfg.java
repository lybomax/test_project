package com.rm.export.cfg;

import lombok.Data;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@Data
public class CellStyleCfg {
	/**
	 * 总标题字体大小，不设置采用默认
	 */
	private Integer fontSize;
	/**
	 * 是否粗体
	 */
	private Boolean fontBold;
	/**
	 * 总标题行高，不设置采用默认
	 */
	private Integer rowHeight;
	/**
	 * 总标题对齐方式，默认居中
	 */
	private String alignment;
	/**
	 * 是否显示边框
	 */
	private Boolean border;
	
	private Short verticalAlignment = CellStyle.VERTICAL_CENTER;
	/**
	 * 背景颜色
	 */
	private String backgroundColor;

	public CellStyle toCellStyle(XSSFWorkbook wb) {
		Font font = wb.createFont();
		if (fontSize != null) {
			font.setFontHeightInPoints(fontSize.shortValue());
		}
		if (fontBold) {
			font.setBoldweight(Font.BOLDWEIGHT_BOLD);
		}
		CellStyle cellStyle = wb.createCellStyle();
		cellStyle.setFont(font);
		if (border) {
			cellStyle.setBorderBottom(CellStyle.BORDER_THIN);
			cellStyle.setBorderLeft(CellStyle.BORDER_THIN);
			cellStyle.setBorderRight(CellStyle.BORDER_THIN);
			cellStyle.setBorderTop(CellStyle.BORDER_THIN);
		}
		if (StringUtils.isNotBlank(alignment)) {
			Short alignmentShort = null;
			if (StringUtils.equalsIgnoreCase(alignment, "left")) {
				alignmentShort = CellStyle.ALIGN_LEFT;
			}
			if (StringUtils.equalsIgnoreCase(alignment, "center")) {
				alignmentShort = CellStyle.ALIGN_CENTER;
			}
			if (StringUtils.equalsIgnoreCase(alignment, "right")) {
				alignmentShort = CellStyle.ALIGN_RIGHT;
			}
			if(alignmentShort!=null) {
				cellStyle.setAlignment(alignmentShort.shortValue());
			}
		}
		if (verticalAlignment != null) {
			cellStyle.setVerticalAlignment(verticalAlignment.shortValue());
		}
		cellStyle.setWrapText(true);
		if (StringUtils.isNotBlank(backgroundColor)) {
			cellStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);//填充单元格
			cellStyle.setFillForegroundColor(NumberUtils.toShort(backgroundColor));//设置单元格背景色
		}
		return cellStyle;
	}

}
