package com.xueyuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.mbg.beans.User;
import cn.mbg.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService us;
	
	@RequestMapping("allUser")
	@ResponseBody
	public List<User> allUser(){
		List<User> list = us.getUserAll();
		System.out.println(list);
		return list;
	}
	@RequestMapping("saveuser")
	public String saveUser(User user) {
		System.out.println(">>>"+user);
		return "index";
	}

}
