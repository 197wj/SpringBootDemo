package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountController {

	@RequestMapping("/reg")
	public String reg(){
		
		return "reg";
	}
	
	@GetMapping("/logout")
	public String logout(Model model){
		
		model.addAttribute("username", "root");
		model.addAttribute("password", "123");
		
		return "logout";
	}
	
	// 不设置请求方法的情况下，使用get 或 post 方法都可以实现请求成功
	@RequestMapping("/user/home")
	@ResponseBody
	public String getUser(){
		
		return "user home";
	}
	
	// spring 3.0 增加的新功能，可以不用设置方法属性，直接使用GetMapping 或者 PostMapping 设置请求方法和url
	@GetMapping("/user/show")
	@ResponseBody
	public String userShow(){
		
		return "user show";
	}
	
	@PostMapping("/user/create")
	@ResponseBody
	public String userCreate(@RequestParam("username")String username, @RequestParam("password")String password){
		
		return "user create: username=" + username + ", password=" + password;
	}
}
