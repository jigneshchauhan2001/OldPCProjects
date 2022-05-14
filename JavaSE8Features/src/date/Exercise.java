package date;

import java.time.LocalDate;
import java.util.Date;

public class Exercise {

	public static void main(String[] args) {
		Exercise exc = new Exercise();
		exc.generatePaySlip();
	}
	    public void generatePaySlip() {			        
	        System.out.println(LocalDate.of(2016, 11, 9));
	    }
	

}
