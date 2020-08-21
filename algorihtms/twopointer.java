package algorihtms;

import java.util.Arrays;
import java.util.Scanner;



public class twopointer {
	public static int[] twoPointer(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int[] f = new int[2];
		int[] err = {-1,-1};
		
		while(start != end) {
			int sum = arr[start] + arr[end]; 
			if(sum == target) {
				f[0] = start;
				f[1] = end;
				return f;
			}
			else if(sum < target) {
				start++;
			}
				
			else end--;
		}
		return err;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			
		}
		Arrays.sort(arr);
		System.out.println(twoPointer(arr, 50));
		
		
		
	}
}
