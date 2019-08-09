package com.ruimin.test_java8新特性;

import java.util.stream.Stream;

/**
 * @class: test02_Match
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年07月02日 09:31
 * @since: 1.0.0
 */
public class test02_Match {

  public static void main(String[] args) {
//    Match有三个方法
//    allMatch：Stream 中全部元素符合传入的 predicate，返回 true
//    anyMatch：Stream 中只要有一个元素符合传入的 predicate，返回 true
//    noneMatch：Stream 中没有一个元素符合传入的 predicate，返回 true
    String [] l1 = {"1","2","3","a","b","c"};

    boolean result = Stream.of(l1).anyMatch(i -> i.startsWith("a"));
    boolean result2 = Stream.of(l1).anyMatch(i -> i.length()==1);
    System.out.println(result);
    System.out.println(result2);




  }

}
