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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = getValList(root, new ArrayList<>());
        TreeNode node = new TreeNode();
        makeTree(list, 0, node);
        return node;
    }
    
    private List getValList(TreeNode node, List list) {
        if (node.left != null) {
            getValList(node.left, list);
        }
        list.add(node.val);
        if (node.right != null) {
            getValList(node.right, list);
        }
        
        return list;
    }
    
    private void makeTree(List<Integer> list, int idx, TreeNode node) {
        int val = list.get(idx);
        node.val = val;
        if(list.size() == idx + 1) return;
        node.right = new TreeNode();
        makeTree(list, idx+1, node.right);
    }
}