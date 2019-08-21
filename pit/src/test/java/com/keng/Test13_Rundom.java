package com.keng;

import static org.apache.commons.lang3.RandomStringUtils.random;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * @class: Test13_Rundom
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年08月19日 16:09
 * @since: 1.0.0
 */
public class Test13_Rundom {

    @Test
    public void test01() {
        for (int i = 0; i < 10; i++) {
            System.out.println(random(16, true, true));
        }
        String s = "aaa";
        System.out.println("StringUtils.isNotEmpty(s) = " + StringUtils.isNotEmpty(s));
    }

    @Test
    public void test02() {
        String s1 = "ABACA";
        String s2 = "bbb";
        String replace = StringUtils.replace(s1, "AAA", "b");
        String replace2 = StringUtils.replaceChars(s1, "ABC", "b");
        System.out.println("replace = " + replace);
        System.out.println("replace2 = " + replace2);

    }
}
