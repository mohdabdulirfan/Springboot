package com.netcracker.springbootdept.controller;

import com.netcracker.springbootdept.entity.Department;
import com.netcracker.springbootdept.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/department")
public class DepartmentController {

    @Autowired
    DepartmentServiceImpl departmentService;

    @PostMapping(value="/save")
    public String saveDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }

    @GetMapping(value="/getById/{deptId}")
    public Department findDepartmentById(@PathVariable("deptId") Long DId){
        return departmentService.getDeptById(DId);
    }

}
