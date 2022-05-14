package com.spring.profilesdemo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("cat")
public class Cat implements Animals {

	@Override
	public void makeSound() {
		System.out.println("Cat Meows");
	}
	
	
	
}
