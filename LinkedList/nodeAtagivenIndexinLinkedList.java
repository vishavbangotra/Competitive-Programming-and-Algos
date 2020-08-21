package LinkedList;

import java.util.List;

import java.util.LinkedList;
import java.util.Scanner;

public class nodeAtagivenIndexinLinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			List<Integer> list = new LinkedList<>();
			int n = sc.nextInt();
			int x = sc.nextInt();
			for(int i=0; i<n; i++) {
				list.add(sc.nextInt());
			}
			System.out.println(list.get(x-1));

		}
		sc.close();
	}

}
