package com.rm.export.common;

import java.util.UUID;

/**
 * @class: commonUtil
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年11月15日 10:34
 * @since: 1.0.0
 */
public class commonUtil {
	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}
	
	
}
