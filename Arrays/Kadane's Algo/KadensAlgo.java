public class KadensAlgo{
    
    public static void main(String args[]){
        int[] arr = {-80,-25,77,-76,95,82,5,89,-20,-36,-22,-71,-80,37};
        int n = arr.length;
        int maxNum = maxSubArray(arr,n);
        System.out.println("\nLargest Sum : " + maxNum);
    }
    
    public static int maxSubArray(int[] arr,int n){
       int max_so_far = arr[0];
       int max_ending_here = 0;
       int start = 0, end = 0, s = 0;        
        for(int i=0;i<n;i++){
            max_ending_here = max_ending_here + arr[i];
            if(max_so_far<max_ending_here){
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            
         if(max_ending_here<0){
                max_ending_here = 0;
                s = i + 1;
            }
        }
        System.out.print("Largest Sum Contiguous Subarray : ");
        for(int i=start;i<=end;i++){
        System.out.print(arr[i] + " ");
        }
        return max_so_far;
    }
}
