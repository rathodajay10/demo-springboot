package com.example.demo.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Configuration
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
	HttpHeaders headers, HttpStatus status,
	WebRequest request) {
	// Handle validation errors and return a custom error response
	return ResponseEntity.status(HttpStatus.BAD_REQUEST)
	.body("Validation error: " + ex.getMessage());
	}

}
