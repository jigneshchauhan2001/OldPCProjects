package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.lang.model.element.Element;

public class InterfaceConcept {

	public static void main(String[] args) {
		
		/*
		// Function Interface -apply method
		Function<String, Integer> func1 = x -> x.length();
		int len1 =func1.apply("Learning java");
		System.out.println(len1);
		
		// Chaining function
		Function<Integer, Integer> func2 = x -> x*2;
		int len2=func1.andThen(func2).apply("Learning java");
		System.out.println(len2);
		
		Function<Integer, Integer> func3 = x -> x*3;
		int len3=func1.andThen(func2).andThen(func3).apply("Learning java");
		System.out.println(len3);
		*/
		
		/*
		// BinaryOperator extends BiFunction Interface
		BinaryOperator<Integer> func = (x1, x2) -> x1 + x2;
		int result=func.apply(3, 4);
		System.out.println(result);
		
		BiFunction<Integer, Integer, Integer> bifunc = (x1, x2) -> x1 - x2;
		int result1=bifunc.apply(10, 5);
		System.out.println(result1);
		*/
		
		/*
		UnaryOperator<Integer> unfunc = (x) -> x*7;
		int n1=unfunc.apply(10);
		System.out.println(n1);
		
		// Unary Operator in use with replace all
		List<String> list = Arrays.asList("Java", "Python", "Ruby");
		list.replaceAll(ele -> ele + "Naveen");
		System.out.println(list);
		*/
		
		/*
		// Predicate  --> Return type is always boolean
		Predicate<Integer> pred = x -> x>5;
		boolean predres=pred.test(4);
		System.out.println(predres);
		
		// Predicate in use with Stream function to do some filteration on list.
		// Stream --> Filter --> (Comparator optional)--> (map optional) --> Collect 
		// filter take predicate as arg, comparator take sort as arg.
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		// without filteration
		List<Integer> retList=intList.stream().collect(Collectors.toList());
		System.out.println(retList);
		// with filteration
		List<Integer> filteredList=intList.stream().filter(pred).collect(Collectors.toList());
		System.out.println(filteredList);
		
		// Predicate with &&   --> without predicate name directly apply in () in filter
		List<Integer> filteredList2=intList.stream().filter(x -> x<5 && x<9).collect(Collectors.toList());
		System.out.println(filteredList2);
		
		
		List<String> strList = Arrays.asList("Naveen", "Nav", "Navv", "Java", "Jav");
		Predicate<String> predstr = x -> x.startsWith("N");
		// to print name sstart with "N
		List<String> filListstr=strList.stream().filter(predstr).collect(Collectors.toList());
		System.out.println(filListstr);
		
		// to print remaining names
		List<String> filListstr1=strList.stream().filter(predstr.negate()).collect(Collectors.toList());
		System.out.println(filListstr1);
		*/
		
		// Consumer -- takes 1 argument, returns void.
		Consumer<String> myConsumer = x -> System.out.println(x);
		myConsumer.accept("This is Java SE8");
		
		// consumer in use with foreach method in list to print all element of list
		List<Integer> listint = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		listint.forEach(x -> System.out.println(x));
		
		// Supplier takes no argument but returns something
		// here () -> "this is supplier with no args : is a supplier with no args () 
		getText(() -> "this is supplier with no args");
	}
	
	public static void getText(Supplier<String> mysupp) {
		System.out.println(mysupp.get());
	}
	
}
