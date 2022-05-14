package linkedAssign;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Tester2 {

	public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo) {

		listOne.retainAll(listTwo);
		return listOne;
		
		
	
	}

	public static void main(String arga[]) {

		List<Integer> listOne = new LinkedList<Integer>();
		listOne.add(101);
		listOne.add(211);
		listOne.add(10);
		listOne.add(35);
		listOne.add(28);

		List<Integer> listTwo = new LinkedList<Integer>();
		listTwo.add(101);
		listTwo.add(211);
		listTwo.add(10);
		listTwo.add(35);
		listTwo.add(28);

		System.out.println(findCommonElements(listOne, listTwo));
	}
}
