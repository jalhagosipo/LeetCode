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
         return countGoodNodes(root, 0, root.val);
    }

    private int countGoodNodes(TreeNode node, int res, int max) {
         int cur = node.val;
         if(cur >= max) {
             res++;
             max = cur;
         }

         int leftRes = 0, rightRes = 0;
         if(node.left != null) leftRes = countGoodNodes(node.left, 0, max);
         if(node.right != null) rightRes = countGoodNodes(node.right, 0, max);
         return res + leftRes + rightRes;
    }
}