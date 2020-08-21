package hackerreank;

import java.util.*;

public class list<T>
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList();
		int n = sc.nextInt();
		while(n-->0) {
			arr.add(sc.nextInt());
		}
		int q = sc.nextInt();
		while(q-->0) {
			String query = sc.next();
			if(query == "Insert" ) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				arr.add(x, y);
				
			}
			else {
				int z = sc.nextInt();
				arr.remove(z);
			}
			
		}
		Iterator iter = arr.iterator();
		while(iter.hasNext())
			System.out.print(iter.next()+" ");
				
	}


}
