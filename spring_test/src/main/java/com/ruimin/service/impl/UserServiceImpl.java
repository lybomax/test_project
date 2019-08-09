package com.ruimin.service.impl;

import com.ruimin.dao.UserDao;
import com.ruimin.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @class: UserServiceImpl
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年07月01日 17:50
 * @since: 1.0.0
 */
public class UserServiceImpl implements UserService {
//  UserDao userDao = new UserDaoImpl();

  //通过Spring工厂获取 UserDao
  @Override
  public void login() {
    System.out.println("开始查找用户");

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserDao userDao = (UserDao) applicationContext.getBean("userDao");

    userDao.findUsernameAndPassword();
  }
}
