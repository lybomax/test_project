package com.keng;

import org.apache.commons.lang3.StringUtils;

/**
 * @class: Test03_String
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年07月25日 10:29
 * @since: 1.0.0
 */
public class Test03_String {
  /**
   * 用字符 补充到指定位数
   * @param args
   */
  public static void main(String[] args) {
    String s1 = "aa";
    String s2 = StringUtils.rightPad(s1, 6, "123");
    System.out.println("s2 = " + s2);
    int i = 1;
    System.out.println(Double.isNaN(1));
  }

}
