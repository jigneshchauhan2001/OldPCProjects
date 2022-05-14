package phonedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Phone {
	
	// now we want to implement that snapdragon processor in this class.
	// so to connect this Interface with this Phone class Automatically, we need to use keyword -- Autowired..
	// Autowired will search for the RETURN TYPE OF MEYTHOD WHICH RETURNS Object of MobileProcessor so in AppConfig class it has, so it will take from there. 
	
	@Autowired
	@Qualifier("mediaTek")
	MobileProcessor processor;

	
	public MobileProcessor getProcessor() {
		return processor;
	}

	public void setProcessor(MobileProcessor processor) {
		this.processor = processor;
	} 
	
	
	// now we want to call that "Process" method inside this specs method
	// for that we created MobileProcessor as Interface and Snapdragon class implements this interface
	// and in AppConfig class alsp provided method that returns SnapDragon Classs Object. 
	// in that definition we used Interface as  return type becase in future u might not be needed Different type of Processor
	// so in defination we didnt provided SPecifically Return Type as Snapdragon.
	
	
	
	
	 
	public void specs() {
		System.out.println("32gb ram, 64mp camera");
		processor.Process();
		
	}
	
	
	
	
	
}
