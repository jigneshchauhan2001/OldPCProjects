package springassother01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {	
	private AddressService add;	

	public void display() {
		System.out.println(add.getDetails());
	}
}


@Service
class AddressService {

	public String getDetails() {
		return "Electronic City";
	}
}
