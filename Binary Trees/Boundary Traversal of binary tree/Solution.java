//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
    
	ArrayList <Integer> printBoundary(Node node)
	{
	  Solution sol = new Solution();
	    ArrayList<Integer> res = new ArrayList<>();
	    if(node!=null){
	        res.add(node.data);
	    }
	  sol.printBoundaryLeft(node.left,res);
	    
	  sol.printBoundaryLeaves(node.left,res);
	  sol.printBoundaryLeaves(node.right,res);
	    
	  sol.printBoundaryRight(node.right,res);
	    return res;
	    
	}
	
	void printBoundaryLeft(Node node, ArrayList<Integer> res){
	    
	    if(node == null) return; 
	    
	    if(node.left!=null){
	        res.add(node.data);
	        printBoundaryLeft(node.left,res);
	       
	    }
	    
	   else if(node.right!=null){
	        res.add(node.data);
	        printBoundaryLeft(node.right,res);
	        
	    }
	    
	}
	
	void printBoundaryLeaves(Node node,ArrayList<Integer> res){
	    
	    if(node == null) return;
	    
	    printBoundaryLeaves(node.left,res);
	    if(node.left == null && node.right== null){
	        res.add(node.data);
	    }
	    
	   printBoundaryLeaves(node.right,res);
	}
	
	void printBoundaryRight(Node node,ArrayList<Integer> res){
	    if(node == null) return;
	    
	    if(node.right!=null){
	        printBoundaryRight(node.right,res);
	        res.add(node.data);
	    }
	    
	   else if(node.left!=null){
	        printBoundaryRight(node.left,res);
	        res.add(node.data);
	    }
	}
	
	
}
