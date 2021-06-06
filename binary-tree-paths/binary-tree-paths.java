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
     public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        binaryTreePathsDfs(root, "", result);
        return result;
    }

    private void binaryTreePathsDfs(TreeNode node, String str, List result) {
        if(node.left == null && node.right == null) {
            String newStr = str.length() != 0 ? str + "->" + node.val : String.valueOf(node.val);
            result.add(newStr);
        } else {
            String newStr = str.length() != 0 ? str + "->" + node.val : String.valueOf(node.val);
            if(node.left!=null) binaryTreePathsDfs(node.left, newStr, result);
            if(node.right!=null) binaryTreePathsDfs(node.right, newStr, result);
        }
    }
}