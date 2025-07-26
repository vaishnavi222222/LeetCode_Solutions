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
    // public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    // ArrayList<Integer> l1 = new ArrayList<>();
    // ArrayList<Integer> l2 = new ArrayList<>();
    //     tra(root1,l1);
    //     tra1(root2,l2);
    //     System.out.println(l1 +" "+l2);
    //     return l1.equals(l2);
        
    // }
    // public void tra(TreeNode root,ArrayList<Integer> l1){
    //     if(root.left == null && root.right == null)  l1.add(root.val);
    //     if(root.left == null) tra(root.right,l1);
    //     if(root.right == null) tra(root.left,l1);
    // }
    // public void tra1(TreeNode root,ArrayList<Integer> l2 ){
    //     if(root.left == null && root.right == null) l2.add(root.val);
    //     if(root.left == null) tra1(root.right,l2);
    //     if(root.right == null) tra1(root.left,l2);
    // }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        
        collectLeaves(root1, leaves1);
        collectLeaves(root2, leaves2);
        
        return leaves1.equals(leaves2);
    }
    private void collectLeaves(TreeNode node, List<Integer> list) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            list.add(node.val);
        }
        collectLeaves(node.left, list);
        collectLeaves(node.right, list);
    }
}