package com.example.demo.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User login(Map<String, Object> map) {

		return userMapper.selectByUsernameAndPassword(map);
	}

	@Override
	public int register(User user) {

		User userExist = userMapper.selectByUsername(user.getUsername());
		
		if (userExist!=null && userExist.equals("")) {
			
			return 0;
		}
		return userMapper.insertSelective(user);
	}

	@Override
	public int deleteUser(int id) {

		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateUser(User user) {

		return userMapper.updateByPrimaryKeySelective(user);
	}

}
