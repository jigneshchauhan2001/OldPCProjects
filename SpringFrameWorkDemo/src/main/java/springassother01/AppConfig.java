package springassother01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {

	@Bean
	public EmployeeService employee()
	{
//		EmployeeService e = new EmployeeService();
//		e.setAdd(add());
//		return e;
		
		return new EmployeeService();
	}
	
	@Bean
	public AddressService add()
	{
		return new AddressService();
	}
}
