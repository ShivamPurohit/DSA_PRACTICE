//Time Complexity: O(n)
 //total number of comparisons
 //1 + 2(n-2) in worst case
 //1 + n – 2 in best case
 /*
 In the above implementation, worst case occurs when elements are sorted in descending order and best case occurs when elements are sorted in ascending order.
 */
 
public class LinearSearchMethod{
    public static class Pair{
        int min;
        int max;
    }
    
    public static Pair getMinmax(int[] arr, int n){
        Pair minmax = new Pair();
        int i;
        if(n == 1){
            minmax.min = arr[0];
            minmax.max = arr[0];
        }
        
        if(arr[0]>arr[1]){
            minmax.min = arr[1];
            minmax.max = arr[0];
        }else{
            minmax.min = arr[0];
            minmax.max = arr[1];
        }
        
        for(i=2;i<n;i++){
            if(arr[i]>minmax.max){
                minmax.max = arr[i];
            }
            else if(arr[i]<minmax.min){
                minmax.min = arr[i];
            }
        }
        
        return minmax;
        
    }
    
    public static void main(String args[]){
        int[] arr = {19,33,2,11,90,7};
        Pair minmax = getMinmax(arr,arr.length);
        System.out.println("Minimum element = " + minmax.min);
        System.out.println("Maximum element = " + minmax.max);        
    }
    
}
