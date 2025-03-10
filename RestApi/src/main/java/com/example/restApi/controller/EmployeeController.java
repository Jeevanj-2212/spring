package com.example.restApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restApi.entity.Employee;
import com.example.restApi.services.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeService emps;
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Employee> findById(@PathVariable("id") int id) {
	    Employee emp = emps.getById(id);
	    
	    // Debugging line - Print the employee object
	    System.out.println("Employee fetched: " + emp);

	    if (emp == null) {
	        return ResponseEntity.notFound().build(); // Returns 404 if not found
	    }
	    return ResponseEntity.ok(emp);
	}

	
	@GetMapping("/listAll")
	public List<Employee> getAll() {
		return emps.readAllEmp();
	}
	
	@PostMapping("/insert")
	public Employee insert(@RequestBody Employee emp) {
		return emps.addEmployee(emp);
	}
	 @DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		return emps.deleteById(id);
	}
	
	 @PutMapping("/update/{id}")
	 public Employee update(@RequestBody Employee emp) {
		 return emps.update(emp);
	 }
	
}
