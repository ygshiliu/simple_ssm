package com.xueyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("tologin")
	public String toLogin() {
		return "user/login";
	}
	
	@RequestMapping("toregist")
	public String toRegist() {
		return "user/regist";
	}
	
	
	
	
}
