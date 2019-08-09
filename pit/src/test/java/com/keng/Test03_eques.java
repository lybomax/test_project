package com.keng;

import org.apache.commons.lang3.StringUtils;

/**
 * @class: Test03_eques
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年08月05日 09:35
 * @since: 1.0.0
 */
public class Test03_eques {

  public static void main(String[] args) {
    String s1 = new String("aa");
    String s2 = new String("aa");
    String s3 = "aa";
    String s4 = null;
    String s5 = "";
    System.out.println(StringUtils.isEmpty(s4));
    System.out.println(StringUtils.isEmpty(s5));
    System.out.println("---------------------------------------------");
    System.out.println(System.identityHashCode(s1));
    System.out.println(System.identityHashCode(s2));
    System.out.println(System.identityHashCode(s3));
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());

    System.out.println("".equals(s1));
    Integer i1 = 127;
    Integer i2 = 127;
    System.out.println(i1==i2);
    System.out.println(i1.equals(i2));
  }


}
