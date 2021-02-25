public class PostOrderRecursive{
public static void postorder(TreeNode root)
{
    if (root == null) {
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
}
}
