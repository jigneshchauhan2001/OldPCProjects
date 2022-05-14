package lambda;

import java.util.ArrayList;
import java.util.List;

public class FormatterClass  {
	
	
	public static void main(String[] args) {	
		
		// 1
		StringFormatter sf1 = (string1, string2) -> {		
			return string1 + " " + string2;	
		};
		System.out.println(sf1.format("Lambda", "Expression"));
		
		
		//2 
		StringFormatter sf2 = (string1, string2) -> {
			return string1 + " - " + string2;
		};
		System.out.println(sf2.format("Lambda", "Expression"));
		
		// 3
		StringFormatter sf3 = (string1, string2) -> {
			String str1 =string1.toUpperCase();
			String str2 = string2.toUpperCase();
			return str1 +" " + str2;
		};
		System.out.println(sf3.format("Lambda", "Expression"));	
		
		
		List<String> myList = new ArrayList<>();
		myList.stream().fil
}
}
