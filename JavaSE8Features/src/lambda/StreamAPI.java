package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamAPI {

	
	// IMP POINT: 
	//if Collection type data --> list.stream, u have to use
	// if primitive type data like array of int --> Arrays.stream, u have to use
	
	
	public static void main(String[] args) {	
		
		List<String> list = Arrays.asList("Macbook", "iphone", "shoes");
	
		List<String> filList=list.stream().filter(ele -> !ele.equals("shoes")).collect(Collectors.toList());
		filList.forEach(ele -> System.out.println(ele));
		// or
		//filList.forEach(System.out :: println);
		
		//findAny method of stream
		// if present - return object, if not present u can return anything
		Object myobj=list.stream().findAny().filter(ele -> ele.equals("Macbook")).orElse("Not Present");
		System.out.println(myobj);
	
		Boolean b=list.stream().findAny().filter(ele -> ele.equals("Macbook")).isPresent();
		System.out.println(b);
		
		list.stream().findAny().filter(ele -> ele.equals("Macbook")).ifPresent(ele -> System.out.println(ele + " is present"));	
	
	
		// map method of stream ( CAN BE USED INSTEAD OF FILTER)
		// In above with Filter method -- returns Object, 
		// but Using map, u can return data type to user defined data type.
		String mystr=list.stream().map(ele -> ele.concat(" Pro")).findAny().orElse("Element not found");
		System.out.println(mystr);
		
		// printing all names of list using map
		List<String> listusingmap=list.stream().map(ele -> ele).collect(Collectors.toList());
		listusingmap.forEach(System.out :: println);
	}
}

