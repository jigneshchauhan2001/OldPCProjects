package teluskodemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Tester {
	
	public static void main(String[] args) {
	
		// provide name of class in which  Beans are managed
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		// for bike u need to change 1 time at left hand side.
		// if u dont use interface, u need to change at both sides.
//		Vehicle obj = new Car();
//		obj.drive();	
		
		// returns object of class passed in parameter
		Vehicle vehObject = (Vehicle) context.getBean(Bike.class);
		
		
		
	}

}
