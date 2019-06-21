package cn.mbg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.mbg.beans.User;
import cn.mbg.mapper.UserMapper;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper um ;
	
	@Override
	public List<User> getUserAll() {
		return um.selectAll();
	}

}
