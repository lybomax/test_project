package com.keng;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.commons.collections.MapUtils;
import org.junit.Test;

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

    @Test
    public void test02(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key2", "2222");
        map.put("key1", "123");
        //从map中获取值，不存在返回默认值
        Object object = MapUtils.getObject(map, "key1", "defaultValue");
        System.out.println("object = " + object);
        //输出map中值
        MapUtils.debugPrint(System.out, "测试", map);
        //按照key对map进行排序
        Map orderedMap = MapUtils.orderedMap(map);
        System.out.println("orderedMap = " + orderedMap);
        //对map key=value进行反转，value=key
        Map invertMap = MapUtils.invertMap(orderedMap);
        System.out.println("invertMap = " + invertMap);
    }
}
