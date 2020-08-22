package gfg;
import java.util.*;
import java.io.*;
import java.lang.*;

public class longestincreasingsubseq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int[] lis = new int[n];
            for(int i=0; i<n; i++){
                lis[i] = 1;
            }
            for(int i=1; i<n; i++){
                for(int j=0; j<i; j++){
                    if(lis[j] < lis[i])
                        lis[i] = Math.max(lis[i], lis[j]+1);
                }
            }
            for (int i : lis) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}