package com.infosys;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

	@Bean
	public EmployeeService employeeServ() {
		return new EmployeeService();
	}
	
	
}
