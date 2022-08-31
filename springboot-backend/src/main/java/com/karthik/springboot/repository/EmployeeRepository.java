package com.karthik.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthik.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
