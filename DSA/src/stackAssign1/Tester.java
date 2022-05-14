package stackAssign1;

import java.util.Iterator;

public class Tester {

	public static void main(String args[]) {

		Stack stack = new Stack(10);
		stack.push(15);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		calculateSum(stack);

		System.out.println("Updated stack");
		stack.display();
	}

	public static void calculateSum(Stack stack) {
		
		// first taken new stack n1Stack and adding elements to it by popping elemetns from stack, then added some.
		// Now stack becomes empty so we are adding elemetns from n1Stack again back to stack.
		Stack n1Stack = new Stack(10);

		int y = 0;
		while (!stack.isEmpty()) {
			int x = stack.pop();
			y = y + x;
			n1Stack.push(x);
		}
		n1Stack.push(y);
		//n1Stack.display();
	
		
		while(! n1Stack.isEmpty())
		{
		stack.push(n1Stack.pop());
		}
	}
}
