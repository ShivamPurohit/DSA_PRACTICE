public class PostorderIterative{
    public void postOrderIterative(TreeNode root){
      
      Stack<TreeNode> stack = new Stack<>();
      stack.push(root);
      
      Stack<Integer> out = new Stack<>();
      
      while(!stack.empty()){
          TreeNode curr = stack.pop();
          out.push(curr.data);
          
          if(curr.left!=null){
              stack.push(curr.left);
          }
          if(curr.right!=null){
              stack.push(curr.right);
          }
      }
      
      while(!out.empty()){
          System.out.print(out.pop()+" ");
      }
      
    }
}
