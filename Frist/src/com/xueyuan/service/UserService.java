package com.xueyuan.service;

import com.xueyuan.beans.User;

public interface UserService {
	
	boolean saveUser(User user);
	
	User getUserByUsername(User user);
}
