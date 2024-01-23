package com.amr.restfuldb.service;

import com.amr.restfuldb.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

}
