package com.rm.common;


import com.rm.pojo.Pojo01;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
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
		String s1 = UUID.randomUUID().toString().replaceAll("-", "");
		System.out.println("s1 = " + s1);
		
		String uuid = CommonUtil.getUUID();
		System.out.println("uuid = " + uuid);
	}
	@Test
	public void testString(){
		Pojo01 pojo01 = new Pojo01();
		String s = "(String) pojo01";
		Object o = (Object) s;
		System.out.println(o);
		
		Double d = 1.111D;
		int i = d.shortValue();
		System.out.println("i = " + i);
	}
	
}