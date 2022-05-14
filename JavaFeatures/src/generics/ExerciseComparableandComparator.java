package generics;

import java.util.*;


public class ExerciseComparableandComparator  {
	
	public static void main(String[] args) {

		Students student1 = new Students(105, "Cunil");
		Students student2 = new Students(103, "Bunil");
		Students student3 = new Students(104, "Aunil");
		Students student4 = new Students(102, "Dunil");
		Students student5 = new Students(101, "Eunil");
		
		
		List<Students> arrayliList = new ArrayList<>();
		arrayliList.add(student1);
		arrayliList.add(student2);
		arrayliList.add(student3);
		arrayliList.add(student4);
		arrayliList.add(student5);
		
		Collections.sort(arrayliList);   								// -- for sorting acc to name using comparable
		//Collections.sort(arrayliList, new StudentIdComparator());    // for sorting acc to Id using comparable
		System.out.println(arrayliList);
		
	}
	
}
