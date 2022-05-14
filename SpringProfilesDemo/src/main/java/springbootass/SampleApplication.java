package springbootass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SampleApplication.class, args);
		
		ProductService pService = context.getBean(ProductService.class);
		
		try {
			pService.addItem(0);
		} catch (Exception e) {
			System.out.println("Exception caught in main " +e.getMessage());
		}
	}
}
