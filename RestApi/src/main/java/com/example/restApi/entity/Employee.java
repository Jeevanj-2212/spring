package com.example.restApi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true) // Ignore unknown fields
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id") // Ensure proper JSON mapping
    private int id;

    @Column(name = "name", nullable = false)
    @JsonProperty("name")
    private String name;

    @Column(name = "email", nullable = false)
   // @JsonProperty("email")
    private String email;

    @Column(name = "salary", nullable = false)
    //@JsonProperty("salary")
    private int salary;

    @Column(name = "designation", nullable = false)
    @JsonProperty("designation")
    private String designation;

    public Employee(String name, String email, int salary, String designation) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.designation = designation;
    }
    public Employee() {}

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", designation=" + designation + "]";
    }
}
