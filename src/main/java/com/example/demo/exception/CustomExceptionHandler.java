package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String> handleNotfoundException(ResourceNotFoundException ex){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}
	}


