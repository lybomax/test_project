package com.ruimin.test_java8新特性;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @class: test01
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年07月02日 09:11
 * @since: 1.0.0
 */
public class test01 {

  public static void main(String[] args) {
    List<String> myList = Arrays.asList("a", "b", "c", "d", "e");
    myList.stream()
//        .filter(s -> s.startsWith("1"))
//        .map(String::toUpperCase)
//        .sorted()
        .forEach(System.out::print);
    System.out.println("\n===============================");

//  forEach方法接收一个 Lambda 表达式，用来迭代流中的每个数据
    System.out.println("\nforEach方法接收一个 Lambda 表达式，用来迭代流中的每个数据");
    Stream.of(1, 2, 3).forEach(System.out::print);

//    map 用于映射每个元素到对应的结果
    System.out.println("\nmap 用于映射每个元素到对应的结果");
    Stream.of(1, 2, 3).map(i -> i * i).forEach(System.out::print);

//    filter 用于通过设置的条件过滤出元素
    System.out.println("\nfilter 用于通过设置的条件过滤出元素");
    Stream.of(1, 2, 3).filter(i -> i == 1).forEach(System.out::print);

//    limit 用于用于获取指定数量的流
    System.out.println("\nlimit用于用于获取指定数量的流");
    List<Integer> l1 = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      l1.add(i);
    }
    Stream.of(l1).limit(5).forEach(System.out::print);




  }

}
