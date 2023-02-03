package com.example.workshop2.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.workshop2.model.Employee;

@Repository
public class EmployeeImpl implements EmployeeRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Employee> findAll() {
        return jdbcTemplate.query("select * from employees", new BeanPropertyRowMapper<Employee>(Employee.class));
    }

    @Override
    public Employee findById(int id) {
        return jdbcTemplate.queryForObject("select * from employees where id = ?", new BeanPropertyRowMapper<Employee>(Employee.class), id);
    }

    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update("delete from employees where id = ?", id);
    }

    @Override
    public int save(Employee employee) {
        return jdbcTemplate.update("insert into employees (name, email, department) values (?,?,?)", new Object[] {employee.getName(), employee.getEmail(), employee.getDepartment() });
    }

    @Override
    public int update(Employee employee, int id) {
        System.out.println(">>>> " + id);
        System.out.println(">>>> " + employee.getDepartment());
        System.out.println(">>>> " + employee.getName());
        System.out.println(">>>> " + employee.getEmail());
        return jdbcTemplate.update("update employees set name = ?, email = ?, department = ? where id = ?", new Object[] {employee.getName(), employee.getEmail(), employee.getDepartment() ,id}) ;
    }
    
}
