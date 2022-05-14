package thread;


public class MyThread2 extends Thread {

	public MyThread2(String name) {	
		super(name);
	}


	@Override
	public void run() {
		
		int x = 0;
		while(x < 50)
		{
			System.out.println("I am MyThread2");
			x++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		
		}
		
	}
}

