package com.example.workshop2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workshop2.model.Employee;
import com.example.workshop2.repository.EmployeeRepo;

@Service
public class EmployeeService {
    
    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    public Employee findById(int id) {
        return employeeRepo.findById(id);
    }

    public int deleteById(int id) {
        return employeeRepo.deleteById(id);
    }

    public int save(Employee employee) {
        return employeeRepo.save(employee);
    }

    public int update(Employee employee, int id) {
        return employeeRepo.update(employee, id) ;
    } 
}
