package com.ruimin.test;

import com.ruimin.pojo.User;
import org.apache.commons.lang3.StringUtils;

/**
 * @class: Test01
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年09月04日 17:51
 * @since: 1.0.0
 */
public class Test01 {

    public static void main(String[] args) {
        User user = new User();
        user.setId(-1L);
        user.setUserName(StringUtils.EMPTY);
        user.setPassword(StringUtils.EMPTY);
        user.setName(StringUtils.EMPTY);
        user.setAge(-1);
        user.setSex(-1);
        user.setBirthday(null);
        user.setCreated(null);
        user.setUpdated(null);


    }

}
