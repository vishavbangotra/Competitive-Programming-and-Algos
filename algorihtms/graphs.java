package algorihtms;
import java.io.*;
import java.util.*;
import java.lang.*;

public class graphs {

    static ArrayList<ArrayList<Integer>> adjList = new  ArrayList<>(100000);
    static ArrayList<Boolean> mark = new ArrayList<>(100000);

    public static void dfs(int v)
    {
        mark.set(v, true);
        for(int i: adjList.get(v))
        {
            if(!mark.get(i))
                dfs(i);
        }
    }


    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        for(int i=0; i<m; i++)
        {
            int v = sc.nextInt();
            int w = sc.nextInt();

            adjList.get(v);
            adjList.get(w);
        }
//        int cnt = 0;
//        for(int i=0; i<n; i++)
//        {
//            if(!mark.get(i))
//            {
//                dfs(i);
//                cnt++;
//            }
//        }
//        if(cnt>k)
//            System.out.println(-1);
//        else 
//            System.out.println(m - n + k);
//
//        for(ArrayList<Integer> i: adjList)
//        	System.out.println(i);
    }
}
