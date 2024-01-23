package com.amr.restfuldb.dao;

import com.amr.restfuldb.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
