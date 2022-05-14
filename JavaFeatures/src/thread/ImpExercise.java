package thread;

public class ImpExercise {

	public static void main(String[] args) {
		
		ThreadExercise thread1 = new ThreadExercise();
		ThreadExercise thread2 = new ThreadExercise();
		ThreadExercise thread3 = new ThreadExercise();
		ThreadExercise thread4 = new ThreadExercise();
		ThreadExercise thread5 = new ThreadExercise();
		
		thread2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(thread2.getPriority());
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		
	}
}
