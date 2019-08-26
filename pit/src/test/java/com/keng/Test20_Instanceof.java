package com.keng;

import com.pojo.Man;
import com.pojo.Person;

/**
 * @class: Test20_Instanceof
 * @title: //判断一个对象是否属于某个类
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年08月26日 19:45
 * @since: 1.0.0
 */
public class Test20_Instanceof {

    public static void main(String[] args) {
        Person p = new Person();
        Man man = new Man();
        System.out.println(man instanceof Person);
        System.out.println(man instanceof Man);
        System.out.println(p instanceof Man);
    }
}
