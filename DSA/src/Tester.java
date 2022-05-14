

public class Tester {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addAtEnd("Milan");
		list.addAtEnd("Venice");
		list.addAtEnd("Munich");
		list.addAtEnd("Viena");
		//System.out.println("Adding an element to the linked list");
		
		// head
		//System.out.println(list.getHead().getData());
		//list.getHead().setData("Ahmedabad");
		//System.out.println("after changing head");
		//System.out.println(list.getHead().getData());
		// tail
		//System.out.println(list.getTail().getData());
		
		// next of head -- venice -- 2nd element acceessing
		//System.out.println(list.getHead().getNext().getData());
		// 3rd element accesing from head
		//System.out.println(list.getHead().getNext().getNext().getData());
		
		// next element of tail is NULL -- 
		//System.out.println(list.getTail().getNext());
		//so accesing data of it gives runtime error
		//System.out.println(list.getTail().getNext().getData());
		
		
		// AddAtBegin
//		list.addAtBegin("Surendranagar");
//		list.addAtBegin("Viramgam");
		
		//System.out.println(list.getHead().getData());	
		
		// displaying all elements
		//list.display();
		
		// search an element
//		Node temp=list.find("Viena");		
//		if (temp != null) {
//			if (temp.getData().equals("Viena")) {
//				System.out.println("node found");
//			}
//		}
//		else {
//			System.out.println("node not found");
//		}
		
		// OR
//		if (list.find("Viena") != null) {	
//				System.out.println("node found");	
//		}
//		else {
//			System.out.println("node not found");
//		}
		
		// adding surat after munich
//		list.insert("Surat", "Munich");
//		list.display();
		
//		list.delete("Venice");
//		list.display();
			
	}
	
}
