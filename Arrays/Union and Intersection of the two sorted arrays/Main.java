Time Complexity: O(m+n)

public class Main{
    public static void main(String args[]){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,4};
       
        printUnion(arr1,arr2,arr1.length,arr2.length);
        System.out.println("\n-----------");
        printIntersection(arr1,arr2,arr1.length,arr2.length);
    }
    
    public static void printUnion(int[] arr1, int[] arr2,int n1,int n2){
        
        //Union
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }
            else if(arr2[j]<arr1[i]){
                System.out.print(arr2[j]+" ");
                j++;
            }
            else{
                System.out.print(arr2[j]+" ");
                j++;
                i++;
            }
        }
        while(i<n1){
            System.out.print(arr1[i]+" ");
            i++;
        }
        while(j<n2){
            System.out.print(arr2[j]+" ");
            j++;
        }
        
    }
    
    public static void printIntersection(int[] arr1, int[] arr2,int n1,int n2){
        //Intersection
         int i=0,j=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else{
                System.out.print(arr2[j]+" ");
                j++;
                i++;
            }
        }
    }
    
}
