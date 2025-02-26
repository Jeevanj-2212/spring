package com.example.demo.entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	// Field Injection
//	@Autowired
	
	Desktop desk;
	@Autowired
	 public void setDesktop(Desktop desk) {
		 this.desk= desk;
	 }
	// Setter injection completed 
	
	public void doProject() {
		System.out.println("Student is doing the project using");
		desk.show();
	}
}
