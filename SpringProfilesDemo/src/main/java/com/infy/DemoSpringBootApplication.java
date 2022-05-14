package com.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infy.service.CustomerService;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(DemoSpringBootApplication.class, args);
		
		CustomerService service1 = context.getBean(CustomerService.class);
		CustomerService service2 = context.getBean(CustomerService.class);
		
		System.out.println(service1 == service2);
		System.out.println(service1.equals(service2));
		
		//service.display();
	}

	
}
