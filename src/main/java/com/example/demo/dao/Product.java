package com.example.demo.dao;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	public long id;
	
	private String name;
	
	//getter setter

}
