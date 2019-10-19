package com.rm.common;


import com.rm.pojo.Pojo01;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class commonTest {
	
	@Test
	public void test01() throws Exception {
		Map<String, Object> testMap = new HashMap<String, Object>();
		Pojo01 pojo01 = new Pojo01();
		pojo01.setId("123");
		pojo01.setDate("new Date()");
		pojo01.setName("AAA");
		Map map = CommonUtil.beanToMap(pojo01, testMap);
		System.out.println("map = " + map);
		Pojo01 pojo = (Pojo01) CommonUtil.mapToBean(map, new Pojo01());
		System.out.println("pojo = " + pojo);
	}
	
	@Test
	public void testUUID(){
		String uuid = CommonUtil.getUUID();
		System.out.println("uuid = " + uuid);
	}
	
}