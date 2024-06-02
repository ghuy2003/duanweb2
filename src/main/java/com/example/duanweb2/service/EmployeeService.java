package com.example.duanweb2.service;


import com.example.duanweb2.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);


    List<Employee> lstEmployeeFind(String keyWord);

}
