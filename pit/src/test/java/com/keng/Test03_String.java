package com.keng;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

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
     */
    public static void main(String[] args) {
        String s1 = "aa";
        String s2 = StringUtils.rightPad(s1, 6, "123");
        System.out.println("s2 = " + s2);
        int i = 1;
        System.out.println(Double.isNaN(1));
        System.out.println("======================");
        //    返回 startlndex 和 endludex-l 之间的代码点数量。没有配成对的代用字符将计入代码点
        //包小不包大
        String s = "ABCDE";
        int i1 = s.codePointCount(0, 5);
        System.out.println("i1 = " + i1);
        //替换
//        String replace = s.replace("ABC", "A");
//        System.out.println("replace = " + replace);

        //截取  从第1个 截取到 地2个  包小不包大
        String substring = s.substring(0,3);
        //截取  截取第3 后面的  包括3
        String substring2 = s.substring(3);
        System.out.println("substring = " + substring);
        System.out.println("substring2 = " + substring2);
    }

    @Test
    public void test02() {
        String s1 = "aabaaacacaca";
        String s2 = "b";
        String a = StringUtils.replaceChars(s1, "aa", "B");
        System.out.println("a = " + a);
    }

}
