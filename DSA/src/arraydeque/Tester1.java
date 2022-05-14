package arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Tester1 {
	    public static Deque<Character> updateStack(Deque<Character> inputStack) {
	   	
	    	Character firstlast = inputStack.pollLast();
	    	Character secondlast = inputStack.pollLast();
	    	Character thirdlast = inputStack.pollLast();
	    	
	    	inputStack.addFirst(firstlast);
	    	inputStack.addFirst(secondlast);
	    	inputStack.addFirst(thirdlast);
	    	
	    	
	    	
	    	return inputStack;
		}
		
		public static void main(String[] args) {
			
			Deque<Character> inputStack = new ArrayDeque<Character>();
			inputStack.push('E');
			inputStack.push('D');
			inputStack.push('C');
			inputStack.push('B');
			inputStack.push('A');
			
			Deque<Character> resultStack = updateStack(inputStack);
			
			System.out.println("The alphabets in updated stack are:");
			for(Character alphabet: resultStack)
			    System.out.println(alphabet);
		}
}
