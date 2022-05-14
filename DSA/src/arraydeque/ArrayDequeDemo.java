package arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;


// with help of arrayDeque -- u can add add, retrieve and remove elements from BOTH ENDS. FRONT AND END.
public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		// 1 --> ArrayDeque using Deque methods -- FIFO
		Deque<String> arrayDeque = new ArrayDeque<>();
		
		arrayDeque.add("string1");
		arrayDeque.add("string2");
		arrayDeque.add("string3");
		arrayDeque.add("string4");
		arrayDeque.addLast("string5");
		
		
		
		// returns NULL if queue is EMPTY.
//		String str=arrayDeque.peek();
//		System.out.println(str);
		
//		String str=arrayDeque.peekFirst();
//		System.out.println(str);
		
//		String str=arrayDeque.peekLast();
//		System.out.println(str);
		
		
		// POLL method -- returns NULL is deque is empty
		// REMOVE method -- return EXCEPTION
		
		// POLL
		// removes and retrive first element
//		String str=arrayDeque.poll();
//		System.out.println(arrayDeque);
		
//		String str=arrayDeque.pollFirst();
//		System.out.println(arrayDeque);
		
//		String str=arrayDeque.pollLast();
//		System.out.println(arrayDeque);
		
		
		// REMOVE 
//		String str=arrayDeque.remove();
//		System.out.println(arrayDeque);
		
//		String str=arrayDeque.removeFirst();
//		System.out.println(arrayDeque);
		
//		String str=arrayDeque.removeLast();
//		System.out.println(arrayDeque);
		
		// remove with parameter will return boolean if it will remove - true, if not -- false
		boolean bollval=arrayDeque.remove("string1");
		System.out.println(bollval);
		
		
		
		// 2 - ArrayDeque using Stack methods  --- LIFO 
		Deque<String> arrayDequeStack = new ArrayDeque<>();
		
		// PUSH --> Adds elements at FRONT END.
		arrayDequeStack.push("str1");
		arrayDequeStack.push("str2");
		arrayDequeStack.push("str3");
		arrayDequeStack.push("str4");
		arrayDequeStack.push("str5");
		
		
		System.out.println(arrayDequeStack);
		
		// POP -- Remove Last Added Element First
		String ele=arrayDequeStack.pop();
		System.out.println(ele);
		
		
		
		
	}
}
