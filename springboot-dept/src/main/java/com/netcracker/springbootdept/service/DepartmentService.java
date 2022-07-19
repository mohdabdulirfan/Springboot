package com.netcracker.springbootdept.service;

import com.netcracker.springbootdept.entity.Department;

public interface DepartmentService {

    public String addDepartment(Department department);

    public Department getDeptById(long deptId);
}
