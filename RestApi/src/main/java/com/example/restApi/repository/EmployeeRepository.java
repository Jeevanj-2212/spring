package com.example.restApi.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restApi.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
}
