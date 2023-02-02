package com.example.workshop2.repository;

import java.util.List;
import com.example.workshop2.model.Employee;
// 2. Create the interface for Employee Service define the method that will be used then implement Employee 
public interface EmployeeRepo {
    
    // find all employee
    public List<Employee> findAll();
    // find employee by id 
    public Employee findById(int id);
    // delete the employee by the id 
    public int deleteById(int id);
    // save the employee we created 
    public int save(Employee employee);
    // update the employee by getting the id of employee
    public int update(Employee employee, int id);
}
