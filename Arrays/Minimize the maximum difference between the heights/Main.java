//Given heights of n towers and a value k. We need to either increase or decrease height of every tower by k (only once) where k > 0. The task is to minimize the difference between the heights of the longest and the shortest tower after modifications, and output this difference.
//Time Complexity: O(n Log n)

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of Test Cases");
        int t = scan.nextInt();
        scan.nextLine();
        while(t-- > 0){
            System.out.println("\nEnter the Number of elemts in array");
            int n = scan.nextInt();
            System.out.println("\nEnter the key value");
            int k = scan.nextInt();
            int[] arr = new int[n];
            
            for(int i=0;i<n;i++){
                arr[i] = scan.nextInt();
            }
            
          int result = getMinDiff(arr,k,n); 
          System.out.println("\nMaximum difference is : " + result);
        }
    }
    
    static int getMinDiff(int[] arr, int k, int n){
        if(n ==0){
            return 0;
        }
        
        Arrays.sort(arr);
        
        int ans = arr[n-1] - arr[0];
        
        int small = arr[0] + k;
        int big = arr[n-1] - k;
        int temp =0;
        
        if(big<small){
            temp = small;
            small = big;
            big = temp;
        }
        
        for(int i=1;i<n;i++){
            int subtract = arr[i] - k;
            int add = arr[i] + k;
            
            if(subtract >= small || add <= big){
                continue;
            }
            
            if(big-subtract<=add-small){
                small = subtract;
            }
            else{
                big = add;
            }
        }
        
        return Math.min(ans,big-small);
    }
}
