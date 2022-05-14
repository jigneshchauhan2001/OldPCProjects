package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStream {

	public static void main(String[] args) {

		// print all values of list by --> Converting list to Stream
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		list.stream().forEach(System.out::println);

		// Declaring stream
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
		stream.forEach(System.out::println);

		// creating arraylist and findign first element and id present -- printing first
		// element
		Arrays.asList("a1", "a2", "a3").stream().findFirst().ifPresent(System.out::println);

		// Inttream with range function
		IntStream.range(1, 11).forEach(System.out::println);

		// declaring & converting array in stream and calculating average and displaying
		Arrays.stream(new int[] { 1, 2, 3, 4 }).average().ifPresent(System.out::println);
		
		// add function using map & printing with ifPresent 
		Arrays.stream(new int[] { 1, 2, 3, 4 }).map(x -> x + 2).average().ifPresent(System.out::println);
		
		// converting intStream to DoubleStream using mapToDouble method
		Arrays.stream(new int[] { 1, 2, 3, 4 }).mapToDouble(x -> x).forEach(System.out::println);
		
		// converting intStream to ObjectStream using mapToObj method
		Arrays.stream(new int[] { 1, 2, 3, 4 }).mapToObj(x -> x).forEach(System.out::println);
		
		// finding max from given arrayStream 
		Arrays.stream(new int[] { 1, 2, 3, 4 }).max().ifPresent(System.out::println);
		
		
		
		// Limit - in use with Iterate to print 1 to 10 number
		Stream.iterate(1, n-> n+1).limit(10).forEach(System.out::println);
		
		// Limit in use with Iterate to print first 10 odd numbers
		Stream.iterate(1, n->n+1).filter(x -> x%2 != 0).limit(10).forEach(System.out::println);
		}
}
