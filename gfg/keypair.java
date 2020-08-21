package gfg;

import java.util.*;
import java.lang.*;
import java.io.*;
class keypair
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
	    label1:
	    while(t-->0)
	    {
	        int n = sc.nextInt();
	        int x = sc.nextInt();
	        
	        HashMap<Integer, Integer> map = new HashMap<>(n);
	        
	        for(int i=1; i<=n; i++)
	        {
	            map.put(i, sc.nextInt());
	            
	            if(map.containsValue(x-map.get(i)))
	            {
	                System.out.println("Yes");
	                continue label1;
	            }
	        }
	        System.out.println("No");
	    }
	 }
}