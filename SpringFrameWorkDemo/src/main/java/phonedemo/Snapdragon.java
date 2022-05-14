package phonedemo;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {

	public void Process() {
		System.out.println("Snapdragon Processor is best");

	}

}
