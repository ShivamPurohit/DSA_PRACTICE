public class Solution
{
    ArrayList<Integer> list = new ArrayList<>();

	ArrayList <Integer> printBoundary(Node node)
	{
	    Solution s = new Solution();
	    if(node!=null){
	
	    s.leftBoundary(node);
	    s.leaf(node);
	    }
	    if(node.right!=null){
	    s.rightBoundary(node.right);
	    }
	    return list;
	}
	
	void leftBoundary(Node node){
	    if(node!=null){
	        if(node.left!=null){
	            list.add(node.data);
	            leftBoundary(node.left);
	        }else if(node.right!=null){
	            list.add(node.data);
	            leftBoundary(node.right);
	        }
	    }
	}
	
	void leaf(Node node){
	    if(node!=null){
	        leaf(node.left);
	        if((node.left==null)&&(node.right==null)){
	            list.add(node.data);
	        }
	        leaf(node.right);
	    }
	}
	
	void rightBoundary(Node node){
	     if(node!=null){
	        if(node.right!=null){
	            list.add(node.data);
	            rightBoundary(node.right);
	        }else if(node.left!=null){
	            list.add(node.data);
	            rightBoundary(node.left);
	        }
	    }
	}
}
