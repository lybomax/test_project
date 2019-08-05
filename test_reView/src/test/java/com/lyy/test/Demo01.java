package com.lyy.test;

/**
 * @class: Demo01
 * @desc: //基础班复习
 * @author: LiYingYing
 * @date: 2019年07月30日 20:19
 * @since: 1.0.0
 */
public class Demo01 {
  public static void main(String[] args) {
    byte b1=1;
    byte b2=1;
    byte b3= (byte) (b1+b2); //会报错么？会的话要怎么写？
    System.out.println(b3);
//    byte占有一个字节**，取值范围是 `[-128,127]`  若大于 127  则从-128 开始排 如128是- 128 129是-127
    byte b=(byte)128;
    System.out.println(b);
  }
}
