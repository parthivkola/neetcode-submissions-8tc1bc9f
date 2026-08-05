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
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int left=ht(root.left);
        int ryt=ht(root.right);
        boolean currBal = Math.abs(left - ryt) <= 1;
        return currBal && isBalanced(root.left) && isBalanced(root.right);
    }
    public int ht(TreeNode root){
        if(root==null)return 0;
        int left=ht(root.left);
        int ryt=ht(root.right);
        return Math.max(left,ryt)+1;
    }
}
