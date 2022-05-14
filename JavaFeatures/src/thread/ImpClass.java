package thread;

public class ImpClass {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread1 t1 = new MyThread1("my thread1");
		MyThread2 t2 = new MyThread2("my thread2");
		
//		System.out.println(t1.getState());
//		System.out.println(t2.getState());
				
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		t2.setPriority(Thread.MIN_PRIORITY);
		
//		t1.join();
//		t2.join();
		
//		System.out.println(t1.getState());
//		System.out.println(t2.getState());
		
		System.out.println("name: " +t1.getName() +" id: " +t1.getId() + " priority: " +t1.getPriority());
		System.out.println("name: " +t2.getName() +" id: " +t2.getId() + " priority: " +t2.getPriority());
		
		RunnableClass bullet = new RunnableClass();
		Thread gun = new Thread(bullet);
		gun.start();
		
		System.out.println("t1 state: " +t1.getState());
		System.out.println("t2 state: " +t2.getState());
		System.out.println("gun state: " +gun.getState());
		
		
		
	}
}
