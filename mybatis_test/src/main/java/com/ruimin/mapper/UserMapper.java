package com.ruimin.mapper;

import com.ruimin.pojo.User;
import java.util.List;

/**
 *
 * @author Max
 */
 public interface UserMapper {
	/**
	 * 根据id获取用户信息
	 * @param id 要查找用户的ID
	 * @return User
	 */
	 User queryUserById(Long id);
	
	/**
	 * 查询所有用户
	 * @return List<User>
	 */
	 List<User> queryUserAll();
	
	/**
	 * 新增用户
	 * @param user User 类
	 */
	 void insertUser(User user);
	
	/**
	 * 更新用户信息
	 * @param user 类
	 */
	 void updateUser(User user);
	
	/**
	 * 根据id删除用户信息
	 * @param id 查询id
	 */
	 void deleteUserById(Long id);
}
