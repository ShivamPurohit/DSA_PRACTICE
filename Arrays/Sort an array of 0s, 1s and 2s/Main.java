//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
//Execution Time:0.56

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while(t-- > 0){
		    int n = scan.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = scan.nextInt();
		    }
		
		    Arrays.sort(arr);
		    for(int i=0;i<n;i++)
		        System.out.print(arr[i]+" ");
		    System.out.println("");
		}
		
	}
}
