package com.keng;

/**
 * @class: Test07_char
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年08月05日 20:32
 * @since: 1.0.0
 */
public class Test07_char {

    public static void main(String[] args) {
        char c = 'a';
        int i = 'a';
        char c2 = '\u2122';
        System.out.println("c = " + c);
        System.out.println("i = " + i);
        System.out.println("c2 = " + c2);
        System.out.println("==========================");
        String s = "hello";
        int n = s.length();
        int n2 = s.codePointCount(0,s.length());
        System.out.println(n);
        System.out.println(n2);
        int i1 = s.codePointAt(2);
        System.out.println("i1 = " + i1);
//        按照字典顺序，如果字符串位于 other 之前，返回一个负数；如果字符串位于 other 之 后，返回一个正数；如果两个字符串相等，返回 0。
        System.out.println(s.compareTo("a"));
        System.out.println(s.compareTo("z"));
        System.out.println(s.compareTo("hello"));
        System.out.println("===========================");
        char cc = s.charAt(0);
        char cc2 = s.charAt(2);
        System.out.println("cc = " + cc);
        System.out.println("cc2 = " + cc2);
        System.out.println("===========================");
//        将这个字符串的码点作为一个流返回。调用 toArray将它们放在一个数组中
        int[] codePoints = s.codePoints().toArray();
        for (int codePoint : codePoints) {
            System.out.println(codePoint);
        }

    }


}
