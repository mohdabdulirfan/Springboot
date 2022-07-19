package com.netcracker.springboot.vo;

import com.netcracker.springboot.entity.Department;
import com.netcracker.springboot.entity.Employee;

public class ResponseTemplate {

    private Employee employee;
    private Department department;

    public ResponseTemplate() {

    }


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
