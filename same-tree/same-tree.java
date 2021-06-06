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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if( p == null && q == null) return true;
        boolean isSameValue = p != null && q != null && p.val == q.val;
        boolean isLeftSame = isSameValue && isSameTree(p.left, q.left);
        boolean isRightSame = isSameValue && isSameTree(p.right, q.right);
        return isLeftSame && isRightSame;
    }
}