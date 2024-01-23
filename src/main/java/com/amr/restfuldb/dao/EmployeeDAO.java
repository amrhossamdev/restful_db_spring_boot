package com.amr.restfuldb.dao;

import com.amr.restfuldb.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
