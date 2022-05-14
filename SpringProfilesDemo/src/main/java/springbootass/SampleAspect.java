package springbootass;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SampleAspect {

	@AfterThrowing(pointcut = "execution(public void addItem())", throwing =  "e")
	public void logExeceptionFromDAO(Exception e) {
		System.out.println(e.getMessage());
	}
	
}
