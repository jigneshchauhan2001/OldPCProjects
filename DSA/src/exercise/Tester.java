package exercise;

public class Tester {

	public static void main(String args[]) {

		LinkedList linkedList = new LinkedList();
		linkedList.addAtEnd("AB");
		linkedList.addAtEnd("BC");
		linkedList.addAtEnd("CD");
		linkedList.addAtEnd("DE");
		linkedList.addAtEnd("EF");
		
//		linkedList.addAtEnd("Python");
//		linkedList.addAtEnd("C#");
//		linkedList.addAtEnd("C");
//		linkedList.addAtEnd("C++");
//		linkedList.addAtEnd("Java");
//		linkedList.addAtEnd("Scala");
//		linkedList.addAtEnd("PHP");

		String elementToBeFound = "E";
		int position = findPosition(elementToBeFound, linkedList.getHead());
		if (position != 0)
			System.out.println("The position of the element is " + position);
		else
			System.out.println("The element is not found!");
	}

	public static int findPosition(String element, Node head) {
		
		Node temp = head;
		int counter = 1;
		boolean flag = false;	
	
		while (temp != null) {
			if (temp.getData().equals(element)) {	
				return counter;	
			}		
			counter++;
			temp=temp.getNext();
			}	
			return 0;
	}
}
