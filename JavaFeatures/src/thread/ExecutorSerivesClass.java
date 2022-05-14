package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorSerivesClass implements Runnable {

	@Override
	public void run() {	
			System.out.println(" I am the thread-- "  +Thread.currentThread().getName()+ " -- running with help of Executor and not created thread manually.");		
	}
	
	
	static Runnable runnable1 = new ExecutorSerivesClass();
	static Runnable runnable2 = new ExecutorSerivesClass();
	static Runnable runnable3 = new ExecutorSerivesClass();
	static Runnable runnable4 = new ExecutorSerivesClass();
	
	public static void main(String[] args) {
		
		// u give size(number) of thread to perform given task and it will automatically create threads and gets work done
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		try {
			executorService.execute(runnable1);
			executorService.execute(runnable2);
			executorService.execute(runnable3);
			executorService.execute(runnable4);
			
		} catch (Exception e) {
		
			System.out.println("failed to call Runable using execotor");
		}
		
		// shuts down after all the task is finished by executor. 
		executorService.shutdown();
		
		// shuts down immediately when compiler reaches this code and weather  task finished or not it shuts down executor.
		//executorService.shutdownNow();
		
		
		// awaitTermination
//		try {
//			executorService.awaitTermination(2, TimeUnit.SECONDS);
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}
		
		while (!executorService.isTerminated()) {
			
		}
		
		// if u print without await Termination OR while block then compiler will print first and then it will print 4, 
		// means it gets  executed before all 4 runnable tasks, so to avoid this u can wait compiler for given time after 
		// all task done to do this msg get printed.
		// OR u can use while loop -- it becomes falls when all tasks assigned to executor being done and it gets Terminated later
		System.out.println(executorService.isShutdown());
		
		System.out.println(executorService.isTerminated());
		
	}
}
