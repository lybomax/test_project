package com.ruimin.test_java8新特性;

import java.util.stream.Stream;

/**
 * @class: test03_reduce
 * @title: //主题说明
 * @desc: // 方法根据指定的函数将元素序列累积到某个值。此方法有两个参数：
 * @author: LiYingYing
 * @date: 2019年07月02日 09:46
 * @since: 1.0.0
 */
public class test03_reduce {

  public static void main(String[] args) {
//  reduce  方法根据指定的函数将元素序列累积到某个值。此方法有两个参数：
    int result = Stream.of(1, 2, 3, 4, 5).reduce(0, (a, b) -> a + b);
    System.out.println("result = " + result);

  }

}
