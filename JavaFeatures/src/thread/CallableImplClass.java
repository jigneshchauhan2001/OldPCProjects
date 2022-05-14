package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableImplClass {

	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Callable<Integer> callable = new CallableClass();
		// callable rerturns Future, with help of get method of future -- we can get the return value
		// while in Runnable -- we got retuned nothing as return type is void.
		Future f=executor.submit(callable);
		System.out.println(f.get());
		
		
		List<Future<Integer>> list = new ArrayList<>();
		for (int i = 0; i <100; i++) {
			Future<Integer> future=executor.submit(new CallableClass());
			list.add(future);
		}
		
		for (Future<Integer> future : list) {
			System.out.println(future.get());
		}
	}

}
