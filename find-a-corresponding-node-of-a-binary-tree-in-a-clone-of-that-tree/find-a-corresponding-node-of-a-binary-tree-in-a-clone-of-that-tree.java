/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode result = null;
        if(original == target) {
            result = cloned;
        } else {
            if(original.left != null) result = getTargetCopy(original.left, cloned.left, target);
            if(original.right != null && result == null) result = getTargetCopy(original.right, cloned.right, target);
        }
        return result;
    }
}