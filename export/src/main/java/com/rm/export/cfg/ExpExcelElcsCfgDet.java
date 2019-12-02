package com.rm.export.cfg;

import java.util.LinkedHashMap;
import lombok.Data;

@Data
public class ExpExcelElcsCfgDet{
	private String type;
	
	private String title;
	
	private LinkedHashMap<String,String> fields = new LinkedHashMap<String, String>();
	
	private LinkedHashMap<String,String> fieldsFmt = new LinkedHashMap<String, String>();
	
}
