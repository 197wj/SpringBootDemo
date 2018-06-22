package com.example.demo.service;

import java.util.Map;

import com.example.demo.model.User;

public interface UserService {

	User login(Map<String, Object> map);
	
	int register(User user);
	
	int deleteUser(int id);
	
	int updateUser(User user);
}
