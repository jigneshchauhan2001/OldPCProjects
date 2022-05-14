package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
	
		// how to know no of cores in ur system
		ForkJoinPool corePools = new ForkJoinPool();
		System.out.println(corePools.getParallelism());
		
		
		//DIFF: 
		//in Sequential Stream concept -- ur stream runs only on one SINGLE CORE
		// in parallel stream concept -- ur stream devides on multiple small streams and 
		//these small streams runs on DIFFERENT STREAMS
		
		// parallel() method on stream 
		//Stream.of("Naveen", "jignesh", "sunil", "sagar").parallel().forEach(System.out :: println);
		// OR
		//Stream<String> stream = Stream.of("Naveen", "jignesh", "sunil", "sagar");
		//stream.parallel().forEach(System.out :: println);
		
		//parallelStream() method on Collection 
		Arrays.asList("Naveen", "jignesh", "sunil", "sagar").parallelStream().forEach(System.out :: println);	
		
	}
}
