package phonedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


public class App {

	public static void main(String[] args) {
		
		// provide classname which has Configuration of Beans
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		// Provide Class name for which u want to create Object
		Phone phoneObj=factory.getBean(Phone.class);
		phoneObj.specs();
		
		
		
		
		
	}

}
