package SmallestontheStack;

import java.util.Scanner;

public class Main 
{

	Node head = null;
	
	class Node
	{
		int data;
		Node next;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void push(int data) 
	{
		Node node = head;
		head = new Node();
		head.data = data;
		head.next = node;
		
	}
	public int pop()
	{
		int data = head.data;
		head = head.next;
		return data;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Main main = new Main();
		Scanner scan = new Scanner(System.in);
		int N =scan.nextInt();
		while(N-->0) {
			String temp = scan.next();
			if(temp == "PUSH")
				main.push(scan.nextInt());
			
			else if(temp == "POP")
				System.out.println(main.pop());
			
				
		}

	}
}
