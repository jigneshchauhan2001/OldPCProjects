package phonedemo;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "phonedemo")
public class AppConfig {
	
	// now if u dont want to create this beans manually then u need to add,
	// 1. annotation @ComponentScan in config class
	// 2. @Component in Classes which Object need to be used.
	
	
//
//	@Bean
//	public Phone getPhone()
//	{
//		return new Phone();
//	}
//	
//		
//	@Bean 
//	public MobileProcessor getProcessor()
//	{
//		return new Snapdragon();			
//	}
}
