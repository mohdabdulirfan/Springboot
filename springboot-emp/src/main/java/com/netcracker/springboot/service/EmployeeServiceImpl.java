package com.netcracker.springboot.service;

import com.netcracker.springboot.entity.Department;
import com.netcracker.springboot.entity.Employee;
import com.netcracker.springboot.repository.EmployeeRepository;
import com.netcracker.springboot.vo.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String addEmployee(Employee employee) {

        employeeRepository.save(employee);
        return "Employee saved in DB";
    }

    @Override
    public Employee getEmployeeById(long empId) {
        Employee employee = new Employee();
        employee = employeeRepository.findById(empId).get();
        return employee;
    }

    @Override
    public ResponseTemplate getEmployeeWithDepartment(long empId) {
        ResponseTemplate responseTemplate = new ResponseTemplate();
        Employee employee = employeeRepository.findById(empId).get();
        Department department = restTemplate.getForObject("http://localhost:8091/api/department/getById/"+employee.getDeptId(),Department.class);
        responseTemplate.setEmployee(employee);
        responseTemplate.setDepartment(department);
        return responseTemplate;
    }
}
