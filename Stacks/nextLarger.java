package Stacks;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;



public class nextLarger {

	public static <T> void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			Queue<Integer> queue = new LinkedList<Integer>();
			int n = sc.nextInt();
			while(n-->0) 
			{
				Integer item = sc.nextInt();
				queue.add(item);
			}
				
			
			Integer temp = queue.remove();
		
			while(!queue.isEmpty())
			{
				try
				{
					if(queue.element() > temp)
					{
						temp = queue.remove();
						System.out.print(temp+' ');
					}
					else
					{
						queue.remove();
						System.out.print(temp+' ');
			
					}
				}
				catch(NoSuchElementException ex)
				{
					System.out.print(-1+' ');
				}
			}
			
		}
		sc.close();
	}

}
