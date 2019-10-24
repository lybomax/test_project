package com.rm.common;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @class: bigDecimal
 * @title: //BigDecimal
 * @desc: //BigDecimal  计算  保留小数
 * @author: Lyy
 * @date: 2019年10月24日 18:53
 * @since: 1.0.0
 */
public class bigDecimal {
	
	public static void main(String[] args) {
		BigDecimal b2 = new BigDecimal("500");
		BigDecimal b1 = new BigDecimal("500");
		BigDecimal pct = new BigDecimal("100");
		BigDecimal posFltRt = new BigDecimal("0.20");
		//计算向上浮动金额  保留2位小数
		b2 = b2.multiply((posFltRt.divide(pct)).add(BigDecimal.ONE)).setScale(2, RoundingMode.UP);
		int i1 = b1.compareTo(b2);
		if (i1 > 0) {
			System.out.println("b1 大于 b2");
		}
	}
}
