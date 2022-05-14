package linkedAssign;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Tester3 {
    
	public static List<Integer> mergeLists(List<Integer> listOne, List<Integer> listTwo) {
		
		listOne.addAll(listTwo);	
		Collections.sort(listOne);	
		return listOne;
	}

	public static void main(String args[]) {
		List<Integer> listOne = new LinkedList<Integer>();
		listOne.add(10);
		listOne.add(13);
		listOne.add(21);
		listOne.add(42);
		listOne.add(56);
		
		List<Integer> listTwo = new LinkedList<Integer>();
		listTwo.add(15);
		listTwo.add(20);
		listTwo.add(21);
		listTwo.add(85);
		listTwo.add(92);
		
		List<Integer> mergedList = mergeLists(listOne, listTwo);
		System.out.println(mergedList);
	}
}
