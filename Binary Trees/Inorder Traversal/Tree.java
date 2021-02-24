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
