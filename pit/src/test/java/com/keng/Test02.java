package com.keng;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

/**
 * @class: Test02
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: LiYingYing
 * @date: 2019年07月07日 19:07
 * @since: 1.0.0
 */
public class Test02 {

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
    System.out.println(map.keySet());
    //此方法会爆异常 [Ljava.lang.Object; cannot be cast to [Ljava.lang.Long;
//    long[] ids = ArrayUtils.toPrimitive((Long[])map.keySet().toArray());

    Long[] longs = map.keySet().toArray(new Long[0]);
    System.out.println(Arrays.toString(longs));
  }

}
