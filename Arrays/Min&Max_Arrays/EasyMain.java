// Time Complexity = O(n)
import java.util.Scanner;

public class EasyMain{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number of Test Cases \n");
        int testcase = scan.nextInt();
        scan.nextLine();
        EasyMain mm = new EasyMain();
        while(testcase-- > 0){
            System.out.println("\nEnter the Size of array");
            int size = scan.nextInt();
            System.out.println("\nEnter the array");
            int[] arr = new int[size];
            for(int i=0;i<size;i++){
                arr[i] = scan.nextInt();
            }
            
            mm.getMinMax(arr,size);
        }
        scan.close();
    }
    
   public void getMinMax(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
            
        }
        System.out.printf("The Minimum element is %d and the Maximum element is %d",min,max);
    }
    
}
