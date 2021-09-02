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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
         boolean isDeleted = true;
        while(isDeleted) {
            if(root.left == null && root.right == null && root.val == target) {
                root = null;
                break;
            }
            isDeleted = removeLeafNodesWithParent(root, target);
        }

        return root;
    }

    private boolean removeLeafNodesWithParent(TreeNode node, int target) {
        boolean result = false;
         if(node.left != null) {
             if(node.left.val == target && node.left.left == null && node.left.right == null) {
                 node.left = null;
                 return true;
             }
             result = removeLeafNodesWithParent(node.left, target);
         }
        if(!result && node.right != null) {
            if(node.right.val == target && node.right.left == null && node.right.right == null) {
                node.right = null;
                return true;
            }
            result = removeLeafNodesWithParent(node.right, target);
        }
        return result;
    }
}