package com.infosys;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// U can create 2 beans of same class --- and u can call them individually by their name(or id)
		// If u crete 2 beans and call by theri class name --- then it will get confuse to call which bean 
		// is called among 2 -- so it will give runtime error
		EmployeeService service=context.getBean(EmployeeService.class);
		service.display();
	}

}
