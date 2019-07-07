package com.ruimin.dao.impl;

import com.ruimin.dao.UserDao;
import com.ruimin.pojo.User;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

/**
 * @class: UserDaoImpl
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: LiYingYing
 * @date: 2019年07月01日 15:45
 * @since: 1.0.0
 */
public class UserDaoImpl implements UserDao {

  private SqlSession sqlSession;

  public UserDaoImpl(SqlSession sqlSession){
    this.sqlSession = sqlSession;
  }


  public User queryUserById(Long id) {
    return this.sqlSession.selectOne("UserDaoMapper.queryUserById", id);
  }

  public List<User> queryUserAll() {
    return this.sqlSession.selectList("UserDaoMapper.queryUserAll");
  }

  public void insertUser(User user) {
    this.sqlSession.insert("UserDaoMapper.insertUser", user);
    this.sqlSession.commit();
  }

  public void updateUser(User user) {
    this.sqlSession.update("UserDaoMapper.updateUser", user);
    this.sqlSession.commit();
  }

  public void deleteUserById(Long id) {
    this.sqlSession.delete("UserDaoMapper.deleteUserById", id);
    this.sqlSession.commit();
  }

}
