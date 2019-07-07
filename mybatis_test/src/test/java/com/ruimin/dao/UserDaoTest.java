package com.ruimin.dao;

import com.ruimin.dao.impl.UserDaoImpl;
import com.ruimin.pojo.User;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

public class UserDaoTest {
  private UserDao userDao;
  @Before
  public void setUp() throws Exception {
    String resource = "mybatis-config.xml";
    // 读取配置文件
    InputStream inputStream = Resources.getResourceAsStream(resource);
    // 构建sqlSessionFactory
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    // 获取sqlSession
    SqlSession sqlSession = sqlSessionFactory.openSession();
    // 初始化userDao
    this.userDao = new UserDaoImpl(sqlSession);

  }

  @Test
  public void queryUserById() {
    User user = this.userDao.queryUserById(1l);
    System.out.println(user);

  }

  @Test
  public void queryUserAll() {
    List<User> users = this.userDao.queryUserAll();
    for (User user : users) {
      System.out.println(user);
    }

  }

  @Test
  public void insertUser() {
  }

  @Test
  public void updateUser() {
  }

  @Test
  public void deleteUserById() {
  }
}