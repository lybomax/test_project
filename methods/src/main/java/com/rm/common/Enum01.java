package com.rm.common;

import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * 注释
 * @author Lyy
 */
@Getter
public enum Enum01 {
	/**
	 * 1
	 */
	ONE("1","11"),
	/**
	 *2
	 */
	TWO("2","22"),
	/**
	 *3
	 */
	THREE("3","33"),
	/**
	 *4
	 */
	FOUR("4","44"),
	/**
	 *5
	 */
	FIVE("5","55");
	
	// 成员变量
	private String code;
	private String value;
	
	Enum01(String code,String value){
		this.code = code;
		this.value = value;
	}
	
	public static Enum01 getByCode(String code) {
		if (StringUtils.isBlank(code)) {
			return null;
		}
		for (Enum01 type : values()) {
			if (type.getCode().equals(code)){
				return type;
			}
		}
		return null;
	}
	
	public static Enum01 getByValue(String value) {
		if (StringUtils.isBlank(value)) {
			return null;
		}
		for (Enum01 enum01 : values()) {
			if (enum01.getValue().equals(value)){
				return enum01;
			}
		}
		return null;
	}
	
	public static Map<String, String> toMap() {
		Map<String, String> enumDataMap = new HashMap<String, String>();
		for (Enum01 key : values()) {
			enumDataMap.put(key.getCode(), key.getValue());
		}
		return enumDataMap;
	}

}
