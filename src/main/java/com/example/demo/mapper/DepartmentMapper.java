package com.example.demo.mapper;

import java.util.List;

import com.example.demo.model.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
    
    List<Department> selectAllDepartment();
}