package com.example.restApi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="employee")
@Getter
@Setter
@NoArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name",nullable=false)
	private String name;
	@Column(name="email",nullable=false)
	private String email;
	
	@Column(name="salary",nullable= false)
	private int salary;
	
	@Column(name="designation",nullable= false)
	private String designation;

	public Employee(String name, String email, int salary, String designation) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.designation = designation;
	}
	public Employee() {
	   
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
	

	
	
	
}
