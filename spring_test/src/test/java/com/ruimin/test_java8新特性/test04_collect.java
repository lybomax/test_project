package com.ruimin.test_java8新特性;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @class: test04_collect
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年07月02日 09:51
 * @since: 1.0.0
 */
public class test04_collect {
  public static void main(String[] args) {
//     Collectors类中提供了功能丰富的工具方法
//     toList
//     toSet
//     toCollection
//     toMap
//     ...
    Integer [] i = {1, 1, 2, 3, 4, 5, 5, 5, 5, 5};
    Set<Integer> result = Stream.of(i).collect(Collectors.toSet());
    System.out.println("result = " + result);
    System.out.println(Arrays.toString(i));
    System.out.println("\n==========================");

    String[] s = {"aaa", "bbb", "ccc", "aaa"};
    Set<String> result2 = Stream.of(s).collect(Collectors.toSet());
    System.out.println("result2 = " + result2);
    //for 循环
    IntStream.range(1, 4).forEach(System.out::print);

    System.out.println("\n==========================");
//    随机数
    Random random = new Random();

  }

}
