package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyDaemon extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println(" I am Daemon Thread Running");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Thread running");
		MyDaemon myDaemon = new MyDaemon();
		myDaemon.setDaemon(true);  //setting this thread as Daemon thread // if u do false then it will not set
		myDaemon.start();
		

	}
	
}
