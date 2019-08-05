package com.keng;

import com.pojo.User;
import java.util.ArrayList;
import java.util.List;

/**
 * @class: Test06_forNow
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: LiYingYing
 * @date: 2019年08月05日 15:10
 * @since: 1.0.0
 */
public class Test06_forNew {

  public static void main(String[] args) {
    List<User> list = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      User user = new User();
      user.setId(i);
      list.add(user);
    }
    System.out.println("list = " + list);
  }
}
