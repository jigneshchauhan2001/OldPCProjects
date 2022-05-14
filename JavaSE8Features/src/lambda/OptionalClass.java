package lambda;

import java.util.Optional;

import javax.lang.model.element.Element;

public class OptionalClass {

	public static void main(String[] args) {
		
		//String book = "java";
		String book = null;
		
		// of method only allows NOT NULL
//		Optional<String> optional1 = Optional.of(book);
//		System.out.println(optional1.get());
		
		// ofNullable method asllows NULL & NOT NULL values both.
		
		Optional<String> optional2=Optional.ofNullable(book);
		System.out.println(optional2);
		// System.out.println(optional2.get()); --> this will give exception as we are trying to access value from null 
	
		// if optional2 is NULL, then it returns java 8
	  System.out.println(optional2.orElse("java 8"));
	  
	  
	  
	  // earlier we were using if else for checking null or not
	  if(book != null)
	    System.out.println(book.toUpperCase());
	}
}
