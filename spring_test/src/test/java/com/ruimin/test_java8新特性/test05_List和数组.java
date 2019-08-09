package com.ruimin.test_java8新特性;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @class: test05_List和数组
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年07月02日 10:18
 * @since: 1.0.0
 */
public class test05_List和数组 {

  public static void main(String[] args) {
    List<String> list=new ArrayList<String>();
    list.add("aaa");
    list.add("bbb");
    String[] strings = new String[list.size()];

    String[] strings1 = list.toArray(strings);
    System.out.println("strings1 = " + Arrays.toString(strings1));

//    反过来，如果要将数组转成List怎么办呢？如下：

    String[] s = {"a","b","c"};
    List list2 = java.util.Arrays.asList(s);
    System.out.println("list2 = " + list2);
  }
}
