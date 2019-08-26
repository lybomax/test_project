package com.keng;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

/**
 * @class: Test02_Array
 * @title: //  数组转为基本类型
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年07月07日 19:07
 * @since: 1.0.0
 */
public class Test02_Array {

    public static void main(String[] args) {
        Object i = 3;
        System.out.println("i = " + i);  //3

        Object i1 = 1 == 1 ? 3 : 1.0;
        System.out.println("i1 = " + i1);  //3.0

        Object i2 = 1 == 1 ? 3 : 1;
        System.out.println("i2 = " + i2);  //3

        Object i3 = 1 == 1 ? new Integer(3) : new Double(1);
        System.out.println("i3 = " + i3);  //3.0

        Object i4 = 1 == 1 ? new Integer(3) : new Integer(1);
        System.out.println("i4 = " + i4);  //3

        int a = 1;
        double b = 1.0;
        System.out.println(a == b);
        System.out.println("---------------------------------------------");

    }

    @Test
    public void test02() {
        Map<Long, String> map = new HashMap<>();
        map.put(1L, "111");
        map.put(2L, "222");
        map.put(3L, "333");

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

    @Test
    public void test03() {
      String[] str1 = {"1","2"};
      String[] str2 = {"2","3"};
      //向数据中添加元素
      Object[] add = ArrayUtils.addAll(str1,str2);
        for (Object o : add) {
            System.out.print(o+" ");
        }
        ArrayUtils.reverse(add);
        System.out.println("\n=======================");
        for (Object o : add) {
            System.out.print(o+" ");
        }
    }

}
