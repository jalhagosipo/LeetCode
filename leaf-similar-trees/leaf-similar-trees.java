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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> ary1 = new ArrayList<>();
        List<Integer> ary2 = new ArrayList<>();
        if(root1 != null && root2 != null) {
            ary1 = leafSimilarDfs(root1, ary1);
            ary2 = leafSimilarDfs(root2, ary2);
        }
        
        if(ary1.size() != ary2.size()) return false;
        
        for(int i=0;i<ary1.size();i++) {
            if(ary1.get(i) != ary2.get(i)) return false;
        }
        return true;
    }
    
    private List leafSimilarDfs(TreeNode node, List list) {
        if(node.left == null && node.right == null) {
            list.add(node.val);
            return list;
        }
        if(node.left != null) list = leafSimilarDfs(node.left, list);
        if(node.right != null) list = leafSimilarDfs(node.right, list);
        return list;
    }
}