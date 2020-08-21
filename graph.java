
import java.io.*;
import java.util.*;
import java.lang.*;

public class graph<T> {
	HashMap<T, LinkedList<T>> adjList = new HashMap<>();
		
	public void addVertex(T v) {
		adjList.put(v, new LinkedList<T>());
	}
	public void addEdge(T s, T d) {
		if(!adjList.containsKey(s)) addVertex(s);
		if(!adjList.containsKey(d)) addVertex(d);
		
		adjList.get(s).add(d);
		adjList.get(d).add(s);
	}
	public void printAdjList() {
		for(T i: adjList.keySet()) {
			for(T j: adjList.get(i))
			System.out.println(i+"->"+j);
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		graph g = new graph();
		g.addEdge(1, 5);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		g.addEdge(3, 2);
		g.addEdge(5, 4);
		g.addEdge(6, 3);
		g.printAdjList();
	}
}
