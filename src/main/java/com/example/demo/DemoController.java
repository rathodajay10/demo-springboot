package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ProductRepository;

import jakarta.websocket.server.PathParam;

@RestController
public class DemoController {
	
	@Autowired
	ProductRepository productRepository;
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	

	
	@GetMapping("/hello")
	public String DemoHello() {
		return "Hello Ajay";
	}
	//http://localhost:8085/employee/name?empName=ajay
	@GetMapping("/employee/name")
	public String DemoHello1(@RequestParam String empName) {
		return empName;
	}
	
	
	@GetMapping("/employee/{id}")
	public String getEMployeeName(@PathParam(value = "employeee id") String empId) {
		return empId;
	}
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

}

record Greeting(long id, String content) { }
