package com.keng;

import com.pojo.Man;
import com.pojo.Person;
import com.pojo.User;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * @class: Test14_BeanUtils
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年08月21日 10:16
 * @since: 1.0.0
 */
public class Test14_BeanUtils {
    @Test
    public void test01() throws Exception {
        User user = new User(1,"占山");
        Person person = new Person();
        BeanUtils.copyProperties(person,user);
        System.out.println("person = " + person);
        Man man = new Man();


    }
}
