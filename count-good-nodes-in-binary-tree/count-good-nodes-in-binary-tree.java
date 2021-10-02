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
     public int goodNodes(TreeNode root) {
        return checkNode(root, root.val, 0);
    }

    private int checkNode(TreeNode node, int max, int res) {
        if(max <= node.val) {
            max = node.val;
            res++;
        }
        int leftRes = 0, rightRes = 0;
        if(node.left != null) leftRes = checkNode(node.left, max, 0);
        if(node.right != null) rightRes = checkNode(node.right, max, 0);
        return leftRes + rightRes + res;
    }
}