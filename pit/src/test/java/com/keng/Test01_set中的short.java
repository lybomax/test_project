package com.keng;

import java.util.HashSet;
import java.util.Set;

/**
 * @class: Test01_set中的short
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: LiYingYing
 * @date: 2019年07月07日 18:43
 * @since: 1.0.0
 */
public class Test01_set中的short {

  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    System.out.println(set.size());
    for (int i = 0; i < 100; i++) {
      set.add(i);
      set.remove(i - 1);
    }
    System.out.println(set.size());  //1
    System.out.println("set = " + set); //set = [99]

    Set<Short> set2 = new HashSet<>();
    for (short i = 0; i < 100; i++) {
      set2.add(i);
      set2.remove(i - 1);
    }
    System.out.println(set2.size());    //100
    System.out.println("set2 = " + set2);
  }

}




