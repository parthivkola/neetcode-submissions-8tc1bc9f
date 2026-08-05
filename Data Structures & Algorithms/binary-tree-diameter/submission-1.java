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
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        int lD=diameterOfBinaryTree(root.left);
        int lH=calculateHeight(root.left);
        int rD=diameterOfBinaryTree(root.right);
        int rH=calculateHeight(root.right);
        int sD=lH+rH;
        return Math.max(sD,Math.max(lD,rD));
    }

    private int calculateHeight(TreeNode node) {
        if (node == null) return 0;
        

        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
