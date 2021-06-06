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
     int sumEvenGrandparentResult = 0;
    public int sumEvenGrandparent(TreeNode root) {
        sumGrandChild(root, false, false);
        return sumEvenGrandparentResult;
    }

    private void sumGrandChild(TreeNode node, boolean isFather, boolean isGrand) {
        if(isGrand) sumEvenGrandparentResult += node.val;
        isGrand = isFather;
        isFather = node.val % 2 == 0;
        if(node.left != null) sumGrandChild(node.left, isFather, isGrand);
        if(node.right != null) sumGrandChild(node.right, isFather, isGrand);
    }
}