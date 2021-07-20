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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result = new ArrayList<>();
        if(root1 != null) {
            addAllElements(root1, result);
        }
        if(root2 != null) {
            addAllElements(root2, result);
        }
        result.sort((o1, o2) -> o1 > o2 ? 1 : o1 == o2 ? 0 : -1);
        return result;
    }

    private void addAllElements(TreeNode node, List<Integer> list) {
            list.add(node.val);
            if(node.right != null) addAllElements(node.right, list);
            if(node.left != null) addAllElements(node.left, list);
    }
}