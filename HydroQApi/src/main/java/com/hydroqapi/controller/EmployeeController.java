package com.hydroqapi.controller;

import com.hydroqapi.services.EmployeeService;
import com.hydroqapi.models.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/list")
    public List<Employee> list() {
        return employeeService.employeeList();
    }

    @PostMapping("/save")
    public void save(@RequestBody Employee employee){
        employeeService.EmployeeSave(employee);
    }

    @DeleteMapping("/remove/{id}")
    public String delete(@PathVariable Long id){
        if (!employeeService.findById(id).isPresent()){
            return "employee not found";
        }
        else {
            employeeService.deleteById(id);
            return "deleted";
        }
    }

    @GetMapping("{id}")
    public Optional<Employee> find(@PathVariable Long id){
        return employeeService.findById(id);
    }

    @PostMapping("/update/{id}")
    public String updateById(@RequestBody Employee employee, @PathVariable Long id) {
        if (!employeeService.findById(id).isPresent()) {
            return "employee not found";
        };

        employeeService.employeeUpdate(employee, id);
        return "Success";
    }
}
