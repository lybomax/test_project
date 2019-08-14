package com.keng;

import org.junit.Test;

/**
 * @class: Test10_Object
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年08月13日 11:32
 * @since: 1.0.0
 */
public class Test10_Object {

    private void objectTest01(Object... objects) {
        System.out.println("ABRACADABRA");
    }

    @Test
    public void objectTest02() {
        objectTest01("a","b",1);
    }


}
