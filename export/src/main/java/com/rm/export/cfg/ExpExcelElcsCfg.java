package com.rm.export.cfg;

import java.util.LinkedHashMap;
import java.util.Map;
import lombok.Data;

@Data
public class ExpExcelElcsCfg {
	private ExpExcelCfgDetail config;

	private String title;

	private String sheetName;
	
	private Map<String, ExpExcelElcsCfgDet> contentMap = new LinkedHashMap<String, ExpExcelElcsCfgDet>();
	
}
