package com.example.demo.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.User;

@Mapper
public interface UserMapper {

    int insertSelective(User record);
    
    User selectByUsernameAndPassword(Map<String, Object> map);

    User selectByUsername(String username);

    int updateByPrimaryKeySelective(User record);

    int deleteByPrimaryKey(Integer id);
}