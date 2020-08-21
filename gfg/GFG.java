package gfg;

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 

	public static void main (String[] args)
	 {
	    FastReader sc = new FastReader();
	    int t = sc.nextInt();
	    while(t-->0)
	    {
	        int n = sc.nextInt();
	        PriorityQueue<Integer> arrival = new PriorityQueue<>(n);
	        PriorityQueue<Integer> departure = new PriorityQueue<>(n);
	        Queue<Integer> station = new PriorityQueue<>();
	        
	        for(int i=0; i<n; i++)
	        {
	        	arrival.add(sc.nextInt());
	        }
	        for(int i=0; i<n; i++)
	        {
	        	departure.add(sc.nextInt());
	        }
	        int at;
	        int dt;
	        arrival.remove();
        	station.add(departure.remove());
        	int max = 0;
	        while(!arrival.isEmpty())
	        {
	        	if(station.peek()>=arrival.peek())
	        	{
	        		station.add(departure.remove());
	        		max = Math.max(station.size(), max);
	        	}
	        	else 
	        	{
	        		station.remove();
	        		station.add(departure.remove());
	        		max = Math.max(station.size(), max);
	        	}
	        	arrival.remove();
	        }
	        System.out.println(max);
	        
	    }
	 }
}