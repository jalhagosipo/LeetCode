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
   public int minDiffInBST(TreeNode root) {
        List<Integer> list = getValForDiff(root, new ArrayList<>());
        Collections.sort(list);
        int answer = 100001;
        
        for (int i=1;i<list.size();i++) {
            int diff = list.get(i) - list.get(i - 1);
            if (diff < answer) answer = diff;
        }
        return answer;
    }
    
    private List getValForDiff(TreeNode node, List list) {
        if (node.left != null) {
            getValForDiff(node.left, list);
        }
        list.add(node.val);
        if (node.right != null) {
            getValForDiff(node.right, list);
        }

        return list;
    } 
}