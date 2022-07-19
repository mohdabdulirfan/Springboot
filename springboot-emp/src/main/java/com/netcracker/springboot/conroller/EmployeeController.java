package com.netcracker.springboot.conroller;

import com.netcracker.springboot.entity.Employee;
import com.netcracker.springboot.service.EmployeeServiceImpl;
import com.netcracker.springboot.vo.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/Employee")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @PostMapping(value="/save")
    public String saveEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping(value="/findById/{empId}")
    public Employee findEmployeeById(@PathVariable ("empId") Long EId){
        return employeeService.getEmployeeById(EId);
    }

    @GetMapping(value="/getEmpWithDeptById/{empId}")
    public ResponseTemplate getEmployeeWithDepartment(@PathVariable ("empId") long EId){
        return employeeService.getEmployeeWithDepartment(EId);
    }
}
