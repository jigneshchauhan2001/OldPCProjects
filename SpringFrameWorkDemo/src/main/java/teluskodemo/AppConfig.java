package teluskodemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Bike getBike()
	{
		return new Bike();
	}
}
