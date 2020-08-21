package algorihtms;


import java.util.*;
import java.io.*;
import java.lang.*;


public class BFS {
	
	private boolean[] marked;
	private int[] edgeTo;
	
	
	private void bfs(Graph g, int s)
	{
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(s);
		marked[s] = true;
		while(!queue.isEmpty())
		{
			int v = queue.remove();
			for(int i: v.adj())
			{
				if(!marked[i])
				{
					queue.add(i);
					marked[i] = true;
					edgeTo[i] = v;
				}
			}
		}
	}

}
