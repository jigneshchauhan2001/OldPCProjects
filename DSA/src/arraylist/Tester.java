package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	 public static List<String> getItems(List<Order> orders) {
			
		 List<String> finaList = new ArrayList<String>();
		 
		for (int i = 0; i < orders.size(); i++) {
			List<String> listitem=orders.get(i).getItemNames();
			
			for (int j = 0; j < listitem.size(); j++) {
				finaList.add(listitem.get(j));
			}		
		}
			return finaList;
		}
	    
		public static void main(String[] args) {
			List<Order> orders = new ArrayList<Order>();

			List<String> items1 = new ArrayList<String>();
			items1.add("FriedRice");
			items1.add("Pasta");
			items1.add("Tortilla");
			orders.add(new Order(101, items1, true));

			List<String> items2 = new ArrayList<String>();
			items2.add("Pizza");
			items2.add("Pasta");
			orders.add(new Order(102, items2, true));

			List<String> items3 = new ArrayList<String>();
			items3.add("Burger");
			items3.add("Sandwich");
			items3.add("Pizza");
			orders.add(new Order(103, items3, true));

			List<String> items = getItems(orders);
			System.out.println("List of Items:");
			for (String item : items) {
				System.out.println(item);
			}
}
}
