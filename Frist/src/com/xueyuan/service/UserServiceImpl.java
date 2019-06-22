package com.xueyuan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xueyuan.beans.User;
import com.xueyuan.mapper.UserMapper;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper ;
	
	//注册用户
	@Override
	public boolean saveUser(User user) {
		try {
			return userMapper.insert(user)>0;
		} catch (Exception e) {
			return false;
		}
	}
	
	//登录
	@Override
	public User getUserByUsername(User user) {
		User dbUser = userMapper.selectUserByuserName(user.getUsername());
		if(user.getPassword().equals(dbUser.getPassword())) {
			return dbUser;
		}
		return null;
	}

}
