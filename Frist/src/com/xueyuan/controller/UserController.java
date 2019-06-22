package com.xueyuan.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xueyuan.beans.Result;
import com.xueyuan.beans.User;
import com.xueyuan.service.UserService;


@Controller
public class UserController {
	@Autowired
	UserService us;
	
	//同步
	@RequestMapping("login")
	public String login(User user,Map map,HttpSession session) {
		User dbUser = us.getUserByUsername(user);
		if(dbUser!=null) {
			session.setAttribute("user", user);
			return "index";
		}else {
			map.put("msg", "用户名或密码不正确");
			return "user/login";
		}
	}
	
	//异步
	//@RequestMapping(value="regist",produces="application/text;charset=UTF-8")
	@RequestMapping("regist")
	@ResponseBody
	public Result regist(User user,Map map){
		System.out.println(">>>>>>>>>>"+user);
		boolean flag = us.saveUser(user);
		Result result = new Result();
		if(flag) {
			//注册成功
			result.setMsg("欢迎您成为我们的用户!!");
			result.setState("ok");
			return result;
		}else {
			result.setMsg("不好意思，此用户已经注册过");
			result.setState("fail");
			return result;
		}
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "index";
	}
					

}
