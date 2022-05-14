package thread;

public class MyThread1 extends Thread {

	public MyThread1(String name) {	
		super(name);
	}
	
	
	@Override
	public void run() {
		
		int x = 0;
		while(x< 50)
		{
			System.out.println("I am MyThread1");
			x++;
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

