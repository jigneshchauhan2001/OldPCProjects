package com.spring.profilesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class SpringProfilesDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringProfilesDemoApplication.class, args);
		
		Animals animObj=context.getBean(Animals.class);	
		animObj.makeSound();
		
		
		// With Help of Profiling -- U can control same thing as u were controlling using Primary or Qualifier.
		// write pprfile name in application.properties for the profile that u want to run.

		
	}
	
	
	// Now we comment out that Dog bean which is at class level and created this method level bean 
	// For that comment out that @Component else it will throw runtime error that - 2 beans found
	@Profile("dog")
	@Bean
	public Animals beanObj() {
		return new Dog();
	}

}
