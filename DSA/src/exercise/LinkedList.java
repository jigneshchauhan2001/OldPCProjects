package exercise;

public class LinkedList {

	    private Node head;
		private Node tail;

		public Node getHead() {
			return this.head;
		}

		public Node getTail() {
			return this.tail;
		}

		public void addAtEnd(String data) {
			Node node = new Node(data);

			if (this.head == null) {
				this.head = this.tail = node;
			} else {
				this.tail.setNext(node);
				this.tail = node;
			}
		
		}
}
