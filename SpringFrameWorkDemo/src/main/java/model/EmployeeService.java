package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	
	//@Autowired
	public AddressService add;
	
	public AddressService getAdd() {
		return add;
	}

	public void setAdd(AddressService add) {
		this.add = add;
	}

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
