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
     public TreeNode balanceBST(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        getValueFromBST(root, list);
        TreeNode newRoot = makeBalanceBST(0, list.size() - 1, list);
        return newRoot;
    }

    private void getValueFromBST(TreeNode node, List<TreeNode> list) {
        if (node == null) return;
        if(node.left != null) getValueFromBST(node.left, list);
        list.add(node);
        if(node.right != null) getValueFromBST(node.right, list);
    }

    private TreeNode makeBalanceBST(int start, int end, List<TreeNode> list) {
        if (start > end) return null;
        int mid = (end + start) / 2;
        TreeNode node = list.get(mid);
        node.left = makeBalanceBST(start, mid - 1, list);
        node.right = makeBalanceBST(mid + 1, end, list);
        return node;
    }
}