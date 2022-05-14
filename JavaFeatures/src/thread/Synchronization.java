package thread;

public class Synchronization {
	
	static int counter;
	// it will not print 2000
//	public  void increment() {
//		counter++;
//	}
	
	
	// With Synchronization -- only 1 thread is allowed to call this method. 
	// Hence it will print 2000
	public synchronized void increment() {
		counter++;
	}
	
	public static void main(String[] args) throws InterruptedException {
	

		// printing counter values without threads
//		for (int i = 0; i <1000; i++) {
//			increment();
//		}	
//		System.out.println(counter);	
		
		
		Synchronization obj = new Synchronization();

		// we created thread using Runnable interface 
		// (u can use Runnable object here as well as Runnable Anonymous Class)
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {		
				for (int i = 0; i <1000; i++) {
					obj.increment();
					//increment();
					}	
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {		
				for (int i = 0; i <1000; i++) {
					obj.increment();
					//increment();
					}	
			}
		}); 
		
		t1.start();	
		t2.start();
		
		t1.join();
		t2.join();
			
		System.out.println(counter);
		
	}
}
