package com.example.demo.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	@ResponseBody
	public Map<String, Object> login(@RequestParam("username")String username, @RequestParam("password")String password){
		
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("username", username);
		map.put("password", password);
		
		User user = userService.login(map);
		
		Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
		if (user != null) {
			
			resultMap.put("user", user);
			resultMap.put("status", 10000);
			resultMap.put("msg", "登录成功");
		}else {
			
			resultMap.put("status", 10001);
			resultMap.put("msg", "登录失败");
		}
		
		return resultMap;
	}
}
