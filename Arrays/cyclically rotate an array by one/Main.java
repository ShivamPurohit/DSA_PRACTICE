//Write a program to cyclically rotate an array by one.
//Time Complexity: O(n) As we need to iterate through all the elements
//Auxiliary Space: O(1)


import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
 		scan.nextLine();

		while(t-- >0){
			int n = scan.nextInt();
		    int[] arr = new int[n];
		    
		    for(int i=0;i<n;i++){
		        arr[i] = scan.nextInt();
		    }
		    
		   //rotation by one 
		   int temp = arr[n-1],j;
		   for(j = n-1;j>0;j--){
		       arr[j] = arr[j-1];
		   }
		   arr[0] = temp;
		    
		    for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");
            System.out.println("");
		}
		
		
	}
}
