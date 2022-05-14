package phonedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.infosys.EmployeeService;


public class App {

	public static void main(String[] args) {
		
		// provide classname which has Configuration of Beans
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		// Provide Class name for which u want to create Object
		Phone phoneObj=factory.getBean(Phone.class);
		phoneObj.specs();
		
		
		
		
		
// 				Example : Creating 2 beans of Same Class : 			
//			 	U can create 2 beans of same class --- and u can call them individually by their name(or id)
//				 If u crete 2 beans and call by theri class name --- then it will get confuse to call which bean 
//				 is called among 2 -- so it will give runtime error
//				EmployeeService service=(EmployeeService) context.getBean("employeeService1");
//				service.display();
		
		
		
	}

}
