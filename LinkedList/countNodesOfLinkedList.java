package LinkedList;


public class countNodesOfLinkedList {
	Node head = null;
	
	
	boolean isEmpty() {
		return head == null;
	}
	
	int pop() {
		
		
		return 0;
		
	}
	
	
	
	void push(int data) {
		Node oldfirst = head;
		head = new Node();
		head.data = data;
		head.next = oldfirst;
	}

	public static void main(String[] args) {
		

	}

}
