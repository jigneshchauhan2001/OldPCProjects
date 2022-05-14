package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class impclass {

	public static void main(String[] args) {

		// 2
		myint myintobj = (a) -> {
			System.out.println(" I am method 1 from this lambda: " + a);
		};
		// 3
		myintobj.meth1(6);

		// Lambda with list
		List<String> list = Arrays.asList("Jignesh", "Sunil", "harry");

		// ForEach -- each time take 1 consumer parameter
		// 1st way -- with lambda expression
		list.forEach(s -> System.out.println(s));
		
		// 2nd way -- Annonymous class
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		// 3rd way -- method references
		list.forEach(System.out::println);
	}
}
