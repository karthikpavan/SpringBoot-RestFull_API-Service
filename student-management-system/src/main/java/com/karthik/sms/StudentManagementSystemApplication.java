package com.karthik.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.karthik.sms.entity.Student;
import com.karthik.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1 = new Student("Karthik", "HY", "karthik@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Pavan", "Yogish", "pavan@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("Raja", "HY", "raja@gmail.com");
		 * studentRepository.save(student3);
		 */
		
	}

}
