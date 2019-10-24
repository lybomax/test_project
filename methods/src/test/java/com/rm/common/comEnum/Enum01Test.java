package com.rm.common.comEnum;

import static org.junit.Assert.*;

import java.util.Map;
import org.junit.Test;

public class Enum01Test {
	
	@Test
	public void getByCode() {
		String s = "1";
		Enum01 enum01 = Enum01.getByCode(s);
		System.out.println("enum01 = " + enum01);
	}
	
	@Test
	public void getByValue() {
		String s = "11";
		Enum01 enum01 = Enum01.getByValue(s);
		System.out.println("enum01 = " + enum01);
	}
	
	@Test
	public void toMap() {
		Map<String, String> map = Enum01.toMap();
		System.out.println("map = " + map);
	}
	
	@Test
	public void getCode() {
		Enum01 s = Enum01.ONE;
		String code = s.getCode();
		System.out.println("code = " + code);
	}
	
	@Test
	public void getValue() {
		Enum01 s = Enum01.ONE;
		String value = s.getValue();
		System.out.println("value = " + value);
	}
}