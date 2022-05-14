
public class LinkedList {
	private Node head;
	private Node tail;

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public void addAtEnd(String data) {
		Node node = new Node(data);

		// Check if the list is empty,
		// if yes, make the node as the head and the tail
		if (head == null) {
			head = tail = node;
			// here suppoise tail node becomes abc@50
		} else {
			// 2nd time, tail which is abc@50 now will point to abc@100 by line 25, then
			// tail becomes abc@100 by line 26
			// 3rd time tail which is abc@100 now will point to abc@150 by line 25, then
			// tail becomes abc@100 by line 26
			tail.setNext(node);
			tail = node;
		}
	}

	public void addAtBegin(String data) {
		Node node = new Node(data);

		if (head == null) {
			head = tail = node;
		} else {
			head.setNext(node);
			head = node;
		}

	}

	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

	public Node find(String data) {
		Node temp = head;

		while (temp != null) {
			if (temp.getData().equals(data)) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}

	// adding data after databefore, surat after munich
	public void insert(String data, String dataBefore) {
		Node node = new Node(data);

		if (head == null) {
			head = tail = node;
		}

		else {
			// finding Node after which data has to be added
			Node nodeBefore = find(dataBefore);

			if (nodeBefore != null) {
				// Insert the new node after nodeBefore
				// first we are getting next element of nodebefore and setting that element as
				// next element of node
				node.setNext(nodeBefore.getNext());
				// now setting next element of nodeBefore as node.
				nodeBefore.setNext(node);

				// If nodeBefore is currently the tail node,
				// make the new node as the tail node
				if (nodeBefore == this.tail)
					this.tail = node;
			} else {
				System.out.println("node not found");
			}
		}
	}

	public void delete(String data) {
		// Check if the list is empty,
		if (head == null) {
			System.out.println("list is empty");
		} else {
			// Find the node to be deleted
			Node node = find(data);
			Node temp = head;
			Node nodebefore = null;
			
			// If the node is not found
			if (node == null) {
				System.out.println("Node not found");
			} 
			// If the node to be deleted is the head node
			else if (node == head) {
				// setting next element as head
				head = head.getNext();
				// now setting next element of node to null, so node will be aparted from list
				node.setNext(null);
				
				// If the node to be deleted is also the tail node
				if (node == tail) {
					tail = null;
				}
			} else {
				// Traverse to the node present before the node to be deleted
				while (temp != null) {
					if (temp.getNext() == node) {
						nodebefore = temp;
						break;
					}
					temp = temp.getNext();
				}
				// Remove the node
				nodebefore.setNext(node.getNext());
				// If the node to be deleted is the tail node,
				// then make the previous node as the tail
				if (node == this.tail) {
					this.tail = nodebefore;
					node.setNext(null);
				}
			}
		}

	}
}
