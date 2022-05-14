package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockClass implements Runnable {
	
	private static int counter;
	public void increment() {
		counter++;
	}
	
	
	static Lock lockObj = new ReentrantLock();
	// Synchronization can be achieved through Lock as well
	@Override
	public void run() {
		lockObj.lock();
		System.out.println(Thread.currentThread().getName() + " :is Locked");
		increment();
		System.out.println(counter);
		lockObj.unlock();
		System.out.println(Thread.currentThread().getName() + " :is Un-Locked");
	}
	
	public static void main(String[] args) {
		ExecutorService eService = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			eService.execute(new LockClass());		
		}
		eService.shutdown();
	}
		
}
