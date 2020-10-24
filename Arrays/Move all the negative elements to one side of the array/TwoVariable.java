//Move all the negative elements to one side of the array 
//This is an in-place rearranging algorithm for arranging the positive and negative numbers where the order of elements is not maintained.
//Two Pointer Approach
//Time Complexity: O(N)
//Auxiliary Space: O(1)

public class TwoVariable{
    
    public void reArrange(int[] arr, int left, int right){
        while(left<=right){
            if(arr[left]<0 && arr[right]<0){
                left++;
            }
            else if(arr[left]>0 && arr[right]<0){
                
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                
            }
            
            else if(arr[left]>0 && arr[right]>0){
                right--;
            }
            else{
                left--;
                right++;
            }
        }
    }
    
    void printArray(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String args[]){
        int[] arr = {4,-2,-1,8,30,-5,-6,};
        int n = arr.length;
        TwoVariable m = new TwoVariable();
        m.reArrange(arr,0,n-1);
        m.printArray(arr,n);
    }
}
