package com.rm.export.cfg;

import java.util.HashMap;
import java.util.Map;
import lombok.Data;

@Data
public class ExpExcelCfgDetail {
	/**
	 * 表单列
	 */
	private Integer fieldColspan;
	/**
	 * 默认列宽度
	 */
	private Integer columnWidth;
	/**
	 * 默认行高
	 */
	private Float rowHeight;
	/**
	 * 是否写入导出日期
	 */
	private Boolean subTitleFlg;

	private Map<String, String> valueForamt = new HashMap<String, String>();

	/**
	 * 主标题样式
	 */
	private CellStyleCfg titleStyle;
	/**
	 * 子标题样式
	 */
	private CellStyleCfg subTitleStyle;
	/**
	 * 表单label样式
	 */
	private CellStyleCfg formLabelStyle;

	/**
	 * 表单字段值样式
	 */
	private CellStyleCfg formValueStyle;

	/**
	 * 表格标题样式
	 */
	private CellStyleCfg tableTitleStyle;

	/**
	 * 表格内容样式
	 */
	private CellStyleCfg tableBodyStyle;

}
