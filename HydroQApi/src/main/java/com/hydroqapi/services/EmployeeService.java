package com.hydroqapi.services;

import com.hydroqapi.Repository.EmployeeRepository;
import com.hydroqapi.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee EmployeeSave(Employee employee){
        return employeeRepository.save(employee);
    }
    public List<Employee> employeeList(){
        return employeeRepository.findAll();
    }
    public Optional<Employee> findById(Long id){
        return employeeRepository.findById(id);
    }
    public Employee employeeUpdate(Employee employee,Long id){
        Employee newEmployee = employeeRepository.findById(id).get();
        newEmployee.setEmail(employee.getEmail());
        newEmployee.setFirstName(employee.getFirstName());
        newEmployee.setPhoneNumber(employee.getPhoneNumber());
        newEmployee.setEmergencyContactNumber(employee.getEmergencyContactNumber());
        return newEmployee;
    }
    public void deleteById(Long id){
        employeeRepository.deleteById(id);
    }



}
