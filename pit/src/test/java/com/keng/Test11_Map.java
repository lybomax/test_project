package com.keng;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @class: Test11_Map
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年08月13日 13:24
 * @since: 1.0.0
 */
public class Test11_Map {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "AAA");
        map.put("B", "BBB");
        map.put("C", "CCC");
        map.put("D", "DDD");
        Set<Entry<String, String>> entries = map.entrySet();
        for (Entry<String, String> entry : entries) {
            String key = entry.getKey();
            System.out.println("key = " + key);
            String value = entry.getValue();
            System.out.println("value = " + value);
            System.out.println("=============================");
        }
    }
}
