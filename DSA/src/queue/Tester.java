package queue;

import java.util.Iterator;

public class Tester {
public static void main(String[] args) {
	
	Queue queue = new Queue(7);
    queue.enqueue(2);
    queue.enqueue(7);
    queue.enqueue(9);
    queue.enqueue(4);
    queue.enqueue(6);
    queue.enqueue(5);
    queue.enqueue(10);

    Queue[] queueArray = splitQueue(queue);
        
    System.out.println("Elements in the queue of odd numbers");
    queueArray[0].display();
        
    System.out.println("\nElements in the queue of even numbers");
    queueArray[1].display();
}
    

  
public static Queue[] splitQueue(Queue queue) {
	Queue[] queArr = new Queue[2];
	
	queArr[0] = new Queue(queue.getMaxSize());
	queArr[1] = new Queue(queue.getMaxSize());

	for (int i = 0; i <queue.getMaxSize(); i++) {		
		int x =queue.dequeue();
		
		if (x % 2 == 0) {
			queArr[1].enqueue(x);
		}
		else {
			queArr[0].enqueue(x);
		}
	}
    return queArr; 
}
}
