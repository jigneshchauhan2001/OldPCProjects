package queue;

public class TesterAssign {

	 public static void main(String[] args) {
         
	        Queue queue = new Queue(7);
	        queue.enqueue(13983);
	        queue.enqueue(10080);
	        queue.enqueue(7113);
	        queue.enqueue(2520);
	        queue.enqueue(2500);

	        Queue outputQueue = findEvenlyDivisibleNumbers(queue);
	            
	        System.out.println("Evenly divisible numbers");
	        outputQueue.display();

	    }
	      
	    public static Queue findEvenlyDivisibleNumbers(Queue queue) {
	        
	    	Queue newQueue = new Queue(queue.getMaxSize());
	    	for (int i = 0; i < queue.getMaxSize(); i++) {
				
	    		int x = queue.dequeue();
	    		if(x%2 == 0 && x%3 == 0 && x%4 == 0 && x%5 == 0 && x%6 == 0 && x%7 == 0 && x%8 == 0 && x%9 == 0 && x%10 == 0)
	    		{
	    			newQueue.enqueue(x);
	    		}
			}
	    	return newQueue;
	    }
}
