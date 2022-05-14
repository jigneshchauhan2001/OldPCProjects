package shift;

public class Tester {


    public static void main(String args[]) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.addAtEnd("ABC");
        linkedList1.addAtEnd("DFG");
        linkedList1.addAtEnd("XYZ");
        linkedList1.addAtEnd("EFG");
            
        LinkedList linkedList2 = new LinkedList();
        linkedList2.addAtEnd("ABC");
        linkedList2.addAtEnd("DFG");
        linkedList2.addAtEnd("XYZ");
        linkedList2.addAtEnd("EFG");
            
        System.out.println("Initial List");
        linkedList1.display();

        System.out.println("\nList after left shifting by 2 positions");
        shiftListLeft(linkedList1, 2);
        linkedList1.display();
            
        System.out.println("\nInitial List");
        linkedList2.display();
            
        System.out.println("\nList after right shifting by 2 positions");
        shiftListRight(linkedList2, 2);
        linkedList2.display();
    }

    public static void shiftListLeft(LinkedList linkedList, int n) {
        
    	 Node temp = linkedList.getHead();
    	 Node next = linkedList.getTail();
    	 
    	for(int i=0; i<2; i++) {
			
    		
			linkedList.getHead().getNext().setNext(temp);
			temp = null;
		linkedList.getTail().setNext(next);
			
		}
    	
    }

    public static void shiftListRight(LinkedList linkedList, int n) {
       

    }
}
