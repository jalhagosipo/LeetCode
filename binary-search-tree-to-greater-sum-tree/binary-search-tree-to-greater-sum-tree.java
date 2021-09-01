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
     public TreeNode bstToGst(TreeNode root) {
        makeGstSum(root, 0);
        return root;
    }
    
    private int makeGstSum(TreeNode node, int sum) {
         if(node.left == null && node.right == null) {
             node.val += sum;
             return node.val;
         }
         if(node.right != null) {
             int rightSum = makeGstSum(node.right, sum);
             sum = rightSum;
         }
         node.val += sum;
         sum = node.val;
         if(node.left != null) {
             int leftSum = makeGstSum(node.left, sum);
             sum = leftSum;
         }
         return sum;
    }
}