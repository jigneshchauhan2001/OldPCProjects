package com.infy.component;

import org.springframework.stereotype.Component;

@Component(value = "regular")
public class RegularCustomer implements Customer {

	@Override
	public void display() {
		System.out.println("Regular Customer");
	} 
	
	
}
