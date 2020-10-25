/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        while(t-- > 0){
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scan.nextInt();
            }
                int maxNum = maxSubArray(arr,n);
                System.out.println(maxNum);
            
        }
    }
    
    public static int maxSubArray(int[] arr,int n){
       int max_so_far = arr[0];
       int max_ending_here = 0;
        
        for(int i=0;i<n;i++){
            max_ending_here = max_ending_here + arr[i];
            if(max_so_far<max_ending_here){
                max_so_far = max_ending_here;
            }
            
            if(max_ending_here<0){
                max_ending_here = 0;
            }
        }
        
        
        return max_so_far;
    }
}
