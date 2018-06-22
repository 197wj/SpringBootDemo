package com.example.demo.model;

public class Department {
    private Integer id;

    private String departmentName;

    private String departmentInfo;

    private Integer departmentFloor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getDepartmentInfo() {
        return departmentInfo;
    }

    public void setDepartmentInfo(String departmentInfo) {
        this.departmentInfo = departmentInfo == null ? null : departmentInfo.trim();
    }

    public Integer getDepartmentFloor() {
        return departmentFloor;
    }

    public void setDepartmentFloor(Integer departmentFloor) {
        this.departmentFloor = departmentFloor;
    }
}