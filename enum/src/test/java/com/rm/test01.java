package com.rm;

import com.rm.enums.EnumProvisionStat;
import org.junit.Test;

/**
 * @class: test01
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年12月04日 14:18
 * @since: 1.0.0
 */
public class test01 {
	@Test
	public void test01(){
		System.out.println(EnumProvisionStat.PROVISION.getCode());
		System.out.println("--------------------------------------");
		System.out.println(EnumProvisionStat.getByKey("01"));
		System.out.println("--------------------------------------");
		System.out.println(EnumProvisionStat.toMap());
	}
}
