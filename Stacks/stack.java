package Stacks;
import java.util.LinkedList;
import java.util.Iterator;
public class stack<T> {
	
	private LinkedList<T> list = new LinkedList<T>();

	
	//Create an empty stack;
	public stack() {};
	
	
	public stack(T data) 
	{
		push(data);
	}
	
	
	public int size() 
	{
		return list.size();
	}
	
	
	public T pop()
	{	if(isEmpty())
			throw new java.util.EmptyStackException();
		else 
			return list.removeLast();
	}
	
	public boolean isEmpty()
	{
		return list.size() == 0;
	}
	
	
	public void push(T elem) 
	{
		list.addLast(elem);
	}
	
	public Iterator <T> iterator()
	{
		return list.iterator();
	}
	
	public static void main(String[] args) {
		stack<Integer> s= new stack<Integer>(5);
		s.push(5);
		s.push(10);
		s.push(200);
		s.push(500);
		s.push(120);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());

	}


}
