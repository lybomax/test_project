package com.ruimin.demo;

import com.ruimin.pojo.User;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @class: MyBatisDemo
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: LiYingYing
 * @date: 2019年07月01日 15:29
 * @since: 1.0.0
 */
public class MyBatisDemo {

  public static void main(String[] args) throws Exception {
    //获取配置文件流
    InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
    //创建 sqlSessionFactory
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    //使用sqlSessionFactory  openSession 得到sqlSession
    SqlSession sqlSession = sqlSessionFactory.openSession();

    User user = sqlSession.selectOne("UserMapper.selectUserById", 1L);

    System.out.println("user = " + user);
  }



}
