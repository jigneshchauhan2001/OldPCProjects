package arraydeque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.function.IntFunction;

public class Exercise2 {

	public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {
	
		List<Integer> list1 = new ArrayList<>();
		
		List<Integer> list2 = new ArrayList<>();
		
		List<Integer> list3 = new ArrayList<>();
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		
		
		for (Integer integer : inputStack) {
			list1.add(integer);
			list2.add(integer);
			list3.add(integer);
		}
	
		int count =0;
				
	for (int i = 0; i <inputStack.size(); i++) {
		
		if (list1.contains(list2.get(i))) {
			list2.remove(i);
			list1.c
			++count;
		}
		
		if (count > 1) {
			list1.add(list2.get(i));
		}
		else {
			list3.add(list2.get(i));
		}
		
	}
	
	list3.addAll(list1);
	
	
	for (Integer integer : list3) {
		deque.add(integer);
	}
	return deque;
		
		
//		
//		for ( Integer i_outer : inputStack) {
//			
//			for (Integer i_inner : inputStack) {
//				if(i_outer==i_inner)
//				{
//					count++;
//				}
//			}
//			if(count>=2)
//			{
//				inputStack.addLast(i_outer);
//			}
//			
//		}
		
	
		
		
	}

	public static void main(String[] args) {
		
		Deque<Integer> inputStack = new ArrayDeque<Integer>();
		inputStack.push(10);
		inputStack.push(8);
		inputStack.push(5);
		inputStack.push(8);
		inputStack.push(5);
	
		Deque<Integer> updatedStack = changeSmallest(inputStack);
		
		System.out.println("Stack After Modification:");
		for (Integer value : updatedStack)
			System.out.println(value);
}
}
