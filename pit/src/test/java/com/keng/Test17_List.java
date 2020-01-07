package com.keng;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;

/**
 * @class: Test17_List
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年08月22日 15:46
 * @since: 1.0.0
 */
public class Test17_List {
	
	@Test
	public void ListTest01() {
		//数组转为集合 collection为集合对象(list、set），例如arraylist,elements为数组(还可以为Iterator、Enumeration)
		List<String> list = new ArrayList<String>();
		CollectionUtils.addAll(list, new String[]{"aaa", "bbb"});
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(5);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(2);
		list3.add(1);
		list3.add(4);
		list3.add(3);
		//判断2个集合是否相等，返回false(例如：1，2，3，4与1，4，2，3为相等）
		boolean equalCollection = CollectionUtils.isEqualCollection(list1, list3);
		System.out.println("equalCollection = " + equalCollection);
		
		//取2个集合交集，返回3，4
		Collection intersection = CollectionUtils.intersection(list1, list2);
		System.out.println("intersection = " + intersection);
		//取2个集合合集，返回1，2，3，4，5，6
		Collection union = CollectionUtils.union(list1, list2);
		System.out.println("union = " + union);
		//取2个集合交集的补集，返回1，2，5，6
		Collection disjunction = CollectionUtils.disjunction(list1, list2);
		System.out.println("disjunction = " + disjunction);
		
		//取2个集合差集（list1扣除list2剩余），返回1，2
		Collection subtract = CollectionUtils.subtract(list1, list2);
		System.out.println("subtract = " + subtract);
		
		//将集合转为不可修改集合
		//        Collection unmodifiableCollection = CollectionUtils.unmodifiableCollection(list1);
		//        System.out.println("unmodifiableCollection = " + unmodifiableCollection);
	}
	
	@Test
	public void ListTest02() {
		ArrayList<String> list01 = new ArrayList<>();
		list01.add("1");
		list01.add("2");
		list01.add("3");
        for (int i = 0; i < 15; i++) {
            int i2;
            i2 = i;
            if (i >= list01.size()){
                i2 = i % list01.size();
            }
            String s = list01.get(i2);
            System.out.println("s = " + s);
        }
		
	}
	
	
}
