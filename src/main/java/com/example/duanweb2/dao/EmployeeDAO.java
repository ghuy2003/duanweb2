package com.example.duanweb2.dao;

import com.example.duanweb2.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteByID(int id);


}
