package thread;

import java.util.concurrent.Callable;

public class CallableClass implements Callable<Integer>{
	
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
