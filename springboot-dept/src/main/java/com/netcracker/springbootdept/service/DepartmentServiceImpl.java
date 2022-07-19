package com.netcracker.springbootdept.service;

import com.netcracker.springbootdept.entity.Department;
import com.netcracker.springbootdept.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public String addDepartment(Department department) {

        departmentRepository.save(department);
        return "Department added to DB successfully!";
    }

    @Override
    public Department getDeptById(long deptId) {
        Department department = new Department();
        department = departmentRepository.findById(deptId).get();
        return department;
    }
}
