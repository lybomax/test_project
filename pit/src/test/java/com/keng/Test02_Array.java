package com.keng;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.junit.Test;

/**
 * @class: Test02_Array
 * @title: //  数组转为基本类型
 * @desc: //模块目的、功能描述
 * @author: LiYingYing
 * @date: 2019年07月07日 19:07
 * @since: 1.0.0
 */
public class Test02_Array {

  public static void main(String[] args) {
    Object i = 1 == 1 ? new Integer(3):new Double(1);
    System.out.println("i = " + i);
  }
  @Test
  public void test02(){
    Map<Long, String> map = new HashMap<>();
    map.put(1L,"111");
    map.put(2L,"222");
    map.put(3L,"333");

//    ArrayUtils.toPrimitive方法可以把对象数据转化为基本类型数组
    Set<Long> longs1 = map.keySet();
    System.out.println(longs1);
    //此方法会爆异常 [Ljava.lang.Object; cannot be cast to [Ljava.lang.Long;
//    long[] ids = ArrayUtils.toPrimitive((Long[])map.keySet().toArray());
    System.out.println("\n-----------------------------------------------");

    Long[] longs = longs1.toArray(new Long[0]);
    for (Long aLong : longs) {
      System.out.print(" " + aLong);
    }
    System.out.println("\n-----------------------------------------------");
    System.out.println(Arrays.toString(longs));
  }

}
