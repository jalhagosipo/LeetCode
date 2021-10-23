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
    List<String> rootToLeafList = new ArrayList<>();
    public int sumRootToLeaf(TreeNode root) {
        makeRootToLeafList(root, "");
        int sum = 0;
        for(String str : rootToLeafList) {
            sum += Integer.parseInt(str, 2);
        }
        return sum;
    }

    private void makeRootToLeafList(TreeNode node, String str) {
        if(node.left == null && node.right == null) {
            rootToLeafList.add(str + node.val);
            return;
        }
        if(node.left != null) makeRootToLeafList(node.left, str + node.val);
        if(node.right != null) makeRootToLeafList(node.right, str + node.val);
    }
}