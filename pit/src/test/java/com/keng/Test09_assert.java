package com.keng;

import org.junit.Test;

/**
 * @class: Test09_assert
 * @title: //断言
 * @desc: //断言只是为了用来调试程序，切勿将断言写入业务逻辑中。   如下两个栗子  输出结果不同
 * @author: Lyy
 * @date: 2019年08月08日 15:20
 * @since: 1.0.0
 */
public class Test09_assert {

    public static void main(String[] args) {
        String s = "a";
        assert s == null;
        System.out.println("end");
    }

    @Test
    public void test() {
        String s = "a";
        assert s == null;
        System.out.println("end");
    }

}
