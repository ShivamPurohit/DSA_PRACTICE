class Tree
{
    // Return a list containing the inorder traversal of the given tree
 ArrayList<Integer> li = new ArrayList<Integer>();

    ArrayList<Integer> inOrder(Node root)
    {
        if(root == null) return li;
        
        inorder(root);
        return li;
    }
    
    void inorder(Node root){
        if(root == null) return;
        
        inorder(root.left);
        li.add(root.data);
        inorder(root.right);
    }
    
    
}


/////////////////or//////////////

public static void inorder(TreeNode root)
{
    // return if the current node is empty
    if (root == null) {
        return;
    }
 
    // Traverse the left subtree
    inorder(root.left);
 
    // Display the data part of the root (or current node)
    System.out.print(root.data + " ");
 
    // Traverse the right subtree
    inorder(root.right);
}
