package linkedAssign;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Tester {

	public static List<Integer> removeDuplicates(List<Integer> list) {
	      Set<Integer> setNew = new HashSet<Integer>();
	      List<Integer> listNew = new ArrayList<>();
	      
	      for (Integer integer : list) {
	    	  if (setNew.add(integer) == true)
	    	  {
	    		listNew.add(integer);  
	    	  }
		}
	      return listNew;
		}
		
		public static void main(String args[]) {
			List<Integer> list = new LinkedList<Integer>();
			list.add(10);
			list.add(15);
			list.add(21);
			list.add(15);
			list.add(10);
			
			List<Integer> updatedList = removeDuplicates(list);
			
			System.out.println("Linked list without duplicates");
			for (Integer value : updatedList) {
				System.out.print(value+" ");
			}
}
}
