package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Student;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(FirstProjectApplication.class, args);
		Student s = context.getBean(Student.class);
		s.doProject();
	}

}
