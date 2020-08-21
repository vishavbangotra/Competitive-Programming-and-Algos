package queues;



public class Implementation<E> {
//	Queue<E> queue = new LinkedList<>();
	private Node<E> head, rear;
		
	public void enqueue(E e) {
		Node<E> newNode = new Node<E>(e); 
		if(head == null) {
			head = rear = newNode;
		}
		rear.next = newNode;
		rear = rear.next;
	}
	
}
