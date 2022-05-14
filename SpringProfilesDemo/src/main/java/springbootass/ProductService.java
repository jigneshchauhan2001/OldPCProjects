package springbootass;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public void addItem(Integer id) throws Exception {
		
		if (id > 0) {
			System.out.println("Item Added");
		} else {
			throw new Exception("Invalid Item");
		}
	}
}
