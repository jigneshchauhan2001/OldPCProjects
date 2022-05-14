package assign2;

public class Tester {

	public static void main(String args[]) {

		LinkedList linkedList = new LinkedList();
		LinkedList reversedLinkedList = new LinkedList();

		linkedList.addAtEnd("Data");
		linkedList.addAtEnd("Structures");
		linkedList.addAtEnd("and");
		linkedList.addAtEnd("Algorithms");

		System.out.println("Initial List");
		linkedList.display();

		System.out.println();

		reverseList(linkedList.getHead(), reversedLinkedList);
		System.out.println("Reversed List");
		reversedLinkedList.display();
	}

	public static void reverseList(Node head, LinkedList reversedLinkedList) {
			Node current = head;
			Node previous = null;
			Node next = null;
			
			while (current != null) {
				next = current.getNext();
				current.setNext(previous);
				previous = current;
				current = next;
			}
			
			reversedLinkedList.addAtEnd(previous.getData());
			while (previous.getNext()  != null) {
				reversedLinkedList.addAtEnd(previous.getNext().getData());
				previous=previous.getNext();
			}		
	    }

}
