package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.dao.Employee;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping
	public List<Employee> findEmpById() {
		return employeeRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Employee> findEmpById(@PathParam(value = "") Long empId) {
		return employeeRepository.findById(empId);
	}
	
	@PostMapping
	public Employee saveEMployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	

}
