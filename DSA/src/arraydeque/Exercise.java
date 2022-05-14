package arraydeque;

import java.util.Deque;
import java.util.ArrayDeque;

class Exercise {

	public static Deque<Object> mergeQueue(Deque<Integer> intQueue, Deque<Character> charQueue) {

		Deque<Object> deque = new ArrayDeque<>();

		int IntialIntQueSize = intQueue.size();
		int IntitialCharacterQueSize = charQueue.size();

		if (IntialIntQueSize >= IntitialCharacterQueSize) {
			for (int i = 0; i < IntialIntQueSize; i++) {

				if (!intQueue.isEmpty()) {
					Integer intEle = intQueue.peek();
					deque.add(intEle);
					intQueue.poll();

				}
				if (!charQueue.isEmpty()) {
					Character charELe = charQueue.peek();
					deque.add(charELe);
					charQueue.poll();
				}
				
			}
		} else {

			for (int i = 0; i < IntitialCharacterQueSize; i++) {
				if (!intQueue.isEmpty()) {
					Integer intEle = intQueue.peek();
					deque.add(intEle);
					intQueue.poll();

				}
				if (!charQueue.isEmpty()) {
					Character charELe = charQueue.peek();
					deque.add(charELe);
					charQueue.poll();
				}

			}
		}
		return deque;
	}

	public static void main(String[] args) {

		Deque<Integer> integerQueue = new ArrayDeque<Integer>();
		integerQueue.add(3);
		integerQueue.add(6);
		integerQueue.add(9);

		Deque<Character> characterQueue = new ArrayDeque<Character>();
		characterQueue.add('a');
		characterQueue.add('e');
		characterQueue.add('i');
		characterQueue.add('o');
		characterQueue.add('u');
		characterQueue.add('b');

		Deque<Object> mergedQueue = mergeQueue(integerQueue, characterQueue);

		System.out.println("The elements in the merged queue are:");
		for (Object element : mergedQueue)
			System.out.println(element);

	}
}
