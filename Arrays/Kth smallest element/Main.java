import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int t= scan.nextInt();
	    while(t-- >0){
	        int n = scan.nextInt();
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++){
	            arr[i] = scan.nextInt();
	        }
	        int k = scan.nextInt();
	        Arrays.sort(arr);
	        int first = -1;
	        int min = arr[first+(k)];
	        System.out.println(min);
	        
	    }
	    
	}
}
