package com.rm.export.bean;

import com.rm.export.cfg.CellStyleCfg;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

@Slf4j
public class ExpExcelCfgUtil {

	public static int getIntCfg(Integer inValue, Integer defValue) {
		if (inValue != null) {
			return inValue.intValue();
		}
		return defValue.intValue();
	}
	
	public static boolean getBlCfg(Boolean inValue, Boolean defValue) {
		if (inValue != null) {
			return inValue.booleanValue();
		}
		return defValue.booleanValue();
	}

	public static Integer getIntegerCfg(Integer inValue, Integer defValue) {
		if (inValue != null) {
			return inValue;
		} else {
			if (defValue != null) {
				return defValue;
			}
		}
		return defValue;
	}

	public static Map<String,String> getValueFmtMap(Map<String,String> defMap,Map<String,String> valueMap){
		Map<String,String> retMap = new HashMap<String, String>(defMap);
		if (valueMap!=null && valueMap.size()>0) {
			retMap.putAll(valueMap);
		}
		return retMap;
	}
	
	public static CellStyleCfg getCellStyleCfg(CellStyleCfg in, CellStyleCfg def) {
		CellStyleCfg retCellStyleCfg = new CellStyleCfg();
		try {
			BeanUtils.copyProperties(retCellStyleCfg, def);
			if (in != null) {
				Field[] fields = CellStyleCfg.class.getDeclaredFields();
				for (Field field : fields) {
					String name = field.getName();
					Object object = PropertyUtils.getProperty(in, name);
					if (object != null) {
						PropertyUtils.setProperty(retCellStyleCfg, name, object);
					}
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return retCellStyleCfg;
	}

}
