package LinkedList;

public class reverseLinkedList {
	
	
	
	
	public Node reverse(Node head) {
		Node current = head;
		Node previous = null;
		Node next = null;
		while(current!=null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public static void main(String[] args) {
		
		
	}

}
