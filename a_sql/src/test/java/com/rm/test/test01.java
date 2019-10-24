package com.rm.test;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @class: test01
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年10月15日 14:36
 * @since: 1.0.0
 */
public class test01 {
	
	public static void main(String[] args) {
//		BigDecimal bigDecimal = new BigDecimal("100");
//		BigDecimal bigDecimal1 = new BigDecimal("2.0000");
//		BigDecimal multiply = bigDecimal1.divide(bigDecimal).add(BigDecimal.ONE);
//		BigDecimal divide = multiply.multiply(new BigDecimal("200.563"));
//		System.out.println("divide = " + divide);
//		System.out.println("=========================");
//		DecimalFormat df1 = new DecimalFormat("0.00");
//		String str = df1.format(divide);
//		BigDecimal bigDecimal2 = new BigDecimal(str);
//		System.out.println("str = " + str);
//		System.out.println(bigDecimal2.compareTo(divide));
		
		BigDecimal t1 = new BigDecimal("1111113.15289");
		BigDecimal t2 = new BigDecimal("-3.11289");
		
		//  新的t1值，并初始化
		BigDecimal newt1 = BigDecimal.ZERO;
		
		//  新的t2值，并初始化
		BigDecimal newt2 = BigDecimal.ZERO;
		
		//  精确2位小数
		BigDecimal bigDecimal = t1.setScale(2, RoundingMode.UP);
		
		//  精确一位小数 结果为 -3.2
		newt2 = newt2.add(t2.setScale(1, RoundingMode.FLOOR));
		
		System.out.println(bigDecimal);
		System.out.println("newt2"+ newt2);
	}
}
