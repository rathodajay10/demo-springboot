package com.example.demo.dao;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class EmployeeService {
	
	    @PersistenceContext
	    private EntityManager entityManager;
	    
	    public Employee saveEmployee(Employee employee) {
	        entityManager.persist(employee); // Persist the entity
	        return employee;
	    }

	    public Employee findEmployeeById(Long id) {
	        return entityManager.find(Employee.class, id); // Find an entity by its ID
	    }

}
