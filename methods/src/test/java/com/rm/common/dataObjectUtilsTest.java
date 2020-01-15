package com.rm.common;

import com.rm.pojo.Pojo01;
import java.util.HashMap;
import org.junit.Test;

/**
 * @class: dataObjectUtilsTest
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2020年01月15日 14:21
 * @since: 1.0.0
 */
public class dataObjectUtilsTest {
	@Test
	public void map2beanTest() throws Exception {
		HashMap<String, Object> map = new HashMap<>();
		map.put("id", "01");
		map.put("name", "01");
		map.put("date", "01");
		
		Pojo01 p01 =(Pojo01) DataObjectUtils.map2bean(map, Pojo01.class);
		System.out.println("p01 = " + p01);
	}
}
