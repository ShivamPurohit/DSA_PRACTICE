public class PreorderIterative{
    public void preOrderIterative(TreeNode root){
        
        if(root == null) return;
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.empty()){
            TreeNode curr = stack.pop();
            
            System.out.print(curr.data + " ");
            
            if(curr.right!=null){
                stack.push(curr.right);
            }
            
            if(curr.left!=null){
                stack.push(curr.left);
            }
        }
    }
}
