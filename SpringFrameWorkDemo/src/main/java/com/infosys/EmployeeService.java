package com.infosys;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeService  implements EmpInterface {

	public void display() {
		
		System.out.println("Hello Everyone ");
	}

	
	
	
}
