package Assessment;

import java.awt.print.Printable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import generics.*;
import thread.ImpClass;


class Test{
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = str2.intern();
		System.out.println(str1 == str3);
		
		
	}
	
	
}


class MyGeneric<T extends Number>  { 
	private List<T> vaList = new ArrayList<>();
	
	public void add(T value) {
		
	}
}


interface myinterface { 
	
	default void print()
	{
		System.out.println("default method");
	}
}