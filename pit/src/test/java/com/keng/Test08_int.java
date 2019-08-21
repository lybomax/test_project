package com.keng;

import java.util.Random;
import org.junit.Test;

/**
 * @class: Test08_int
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年08月06日 15:30
 * @since: 1.0.0
 */
public class Test08_int {

    public static void main(String[] args) {
        int i = 1;
        System.out.println();
        System.out.println();
        System.out.println();
    }

    void test02() {
        System.out.println();
        System.out.println();
        System.out.println();
    }

    @Test
    public void test03(){
        Random random = new Random();
        System.out.println(random.nextInt(6));
    }
}
