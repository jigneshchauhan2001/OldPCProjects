package com.spring.profilesdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component
@Profile("dog")
//@Primary
public class Dog implements Animals {

	@Override
	public void makeSound() {
		System.out.println("Dog Barks");
	}
	
	
	
}
