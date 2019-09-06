package com.keng;

import java.util.UUID;
import org.junit.Test;

/**
 * @class: Test22_UUID
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年09月06日 10:24
 * @since: 1.0.0
 */
public class Test22_UUID {

    @Test
    public void test01() {
        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));

    }
}
