public class InorderIterative{
public static void inorderiterative(TreeNode root){
    Stack<TreeNode> stack = new Stack<>();
    TreeNode curr = root;
    while(!stack.empty()|| curr!=null){
        if(curr!=null){
            stack.push(curr);
            curr = curr.left;
        }else{
            curr = stack.pop();
            System.out.println(curr.data+" ");
            curr = curr.right;
        }
    }
}
}
