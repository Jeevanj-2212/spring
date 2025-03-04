package com.example.restApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restApi.entity.Employee;
import com.example.restApi.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repo;
	public Employee getById(int id) {
	    Employee emp = repo.findById(id).orElse(null);
	    System.out.println("Employee fetched: " + emp);
	    return emp;
	}

	
	public List<Employee> readAllEmp() {
		 List<Employee> emp  = repo.findAll();
		 return emp;
	}
	
	public Employee addEmployee(Employee emp) {
		return repo.save(emp);
	}
	
   public String deleteById(int id) {
	   repo.deleteById(id);
	   return "delete success";
	  
	   
   }
   
   public Employee update(Employee emp) {
	   return repo.save(emp);
   }
}
