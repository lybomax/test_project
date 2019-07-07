package com.ruimin.mapper;

import com.ruimin.pojo.User;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

public class UserMapperTest {

  private UserMapper userMapper;
  @Before
  public void setUp() throws Exception {
    // 读取mybatis的全局配置文件
    InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
    // 构建sqlSessionFactory
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    // 获取sqlSession会话, true 表示自动提交事务
    SqlSession sqlSession = sqlSessionFactory.openSession(true);

    // 初始化useMapper
    this.userMapper=sqlSession.getMapper(UserMapper.class);
  }


  @Test
  public void queryUserById() {

  }

  @Test
  public void queryUserAll() {
    List<User> userList = this.userMapper.queryUserAll();
    for (User user : userList) {
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