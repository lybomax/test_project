package com.ruimin.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @class: Test01
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年10月30日 10:22
 * @since: 1.0.0
 */
public class Test01 {
	
	public static void main(String[] args) {
		List<String> list01 = new ArrayList<>();
		list01.add("aaa");
		list01.add("bbb");
		list01.add("ccc");
		list01.add("ddd");
		List<String> list02 = new ArrayList<>();
		list01.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
			
			}
		});
		System.out.println("list02 = " + list02);
	}
	
}
