package com.karthik.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthik.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
