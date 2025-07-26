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
    HashSet<Integer> set = new HashSet<>();
    public void tra(TreeNode root){
        if(root != null)set.add(root.val);
        if(root.left != null) tra(root.left);
        if(root.right != null) tra(root.right);
    }
    public boolean isUnivalTree(TreeNode root) {
        tra(root);
        if(set.size() > 1) return false;
        return true;
    }
}