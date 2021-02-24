/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        TreeNode node = new TreeNode();
        node = mirror(root);
        return node;
    }
    public static TreeNode mirror(TreeNode root){
        if(root == null) return null;
        
        TreeNode left = mirror(root.right);
        TreeNode right = mirror(root.left);
        
        root.left = left;
        root.right = right;
        
        return root;
    }
}
