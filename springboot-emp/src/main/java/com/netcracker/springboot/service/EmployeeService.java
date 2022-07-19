package com.netcracker.springboot.service;

import com.netcracker.springboot.entity.Employee;
import com.netcracker.springboot.vo.ResponseTemplate;

public interface EmployeeService {

    public String addEmployee(Employee employee);

    public Employee getEmployeeById(long empId);

    public ResponseTemplate getEmployeeWithDepartment(long empId);

}
