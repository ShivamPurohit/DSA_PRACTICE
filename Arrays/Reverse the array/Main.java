//Write a program to reverse an array or string

public class Main{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,6,8,9};
        int n  = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nAfter Reversing the array");
        int start = 0,end = n-1;
        reverseArray(arr,n,start,end);
    }
    
    public static void reverseArray(int[] arr, int n, int start, int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
