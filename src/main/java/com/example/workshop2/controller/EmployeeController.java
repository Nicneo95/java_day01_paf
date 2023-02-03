package com.example.workshop2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.workshop2.model.Employee;
import com.example.workshop2.service.EmployeeService;
@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.findById(id);
    }

    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee) + "No. of rows saved to database";
    }

    @PutMapping("/employees/{id}")
    public String updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
        return employeeService.update(employee, id) + "No. of rows updated to database";
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@RequestBody Employee employee, @PathVariable int id) {
        return employeeService.deleteById(id) + "No. of rows deleted";
    }
}
