package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.infy.component.Customer;

@Repository
public class CustomerService {

	@Autowired
	@Qualifier("commercial")
	Customer cus;
	
	public void display() {
		cus.display();
	}
}
