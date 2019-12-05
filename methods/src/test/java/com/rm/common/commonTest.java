package com.rm.common;


import com.rm.pojo.Pojo01;
import com.rm.pojo.Pojo02;
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
	public void testUUID() {
		String s1 = UUID.randomUUID().toString().replace("-", "");
		System.out.println("s1 = " + s1);
		
		String uuid = CommonUtil.getUUID();
		System.out.println("uuid = " + uuid);
	}
	
	@Test
	public void testString() {
		Pojo01 pojo01 = new Pojo01();
		String s = "(String) pojo01";
		System.out.println((Object) s);
		
		double d = 1.111D;
		int i = (short) d;
		System.out.println("i = " + i);
	}
	
	@Test
	public void copyTest() throws Exception {
		Pojo01 pojo01 = new Pojo01();
		pojo01.setId("01");
		pojo01.setName("02");
		pojo01.setDate("03");
		
		Pojo02 pojo02 = new Pojo02();
		
		CommonUtil.copyProperties2(pojo01,pojo02);
		System.out.println("pojo02 = " + pojo02);
		System.out.println("pojo01 = " + pojo01);
		System.out.println("---------------------------------");
		Pojo01 pojo03 = new Pojo01();
		pojo03.setId("01");
		pojo03.setName("02");
		pojo03.setDate("03");
		
		Pojo02 pojo04 = new Pojo02();
		
		CommonUtil.copyProperties(pojo04,pojo03);
		System.out.println("pojo04 = " + pojo04);
		System.out.println("pojo03 = " + pojo03);
	}
	
	@Test
	public void testFor() throws Exception {
		for (int i = 0; i < 10; i++) {
			Pojo01 pojo01 = new Pojo01();
			pojo01.setId("AAA");
			pojo01.setName("BBB");
			pojo01.setDate("CCC");
			
		}
	}
	
}