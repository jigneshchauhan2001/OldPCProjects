package Assessment;

class Running implements Runnable {
 	public void run() {
		// code of run method
	}
}

class SynchronizedExample extends Thread
{
	synchronized public void run()
	{
		System.out.println("start");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){}
		System.out.println("End");
	}
}
