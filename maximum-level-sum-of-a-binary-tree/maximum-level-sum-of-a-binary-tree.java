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
import java.util.*;
class Solution {
    HashMap<Integer, Integer> maxLevelSumHm = new HashMap<>();
    public int maxLevelSum(TreeNode root) {
        checkSumOfTree(root, 1);

        int resultLevel = 1;
        int resultSum = root.val;
        for(int key : maxLevelSumHm.keySet()) {
            int value = maxLevelSumHm.get(key);
            if(value > resultSum) {
                resultLevel = key;
                resultSum = value;
            }
        }
        return resultLevel;
    }

    private void checkSumOfTree(TreeNode node, int level) {
        int sum = 0;
        if(maxLevelSumHm.containsKey(level)) {
            sum = maxLevelSumHm.get(level);
        }

        maxLevelSumHm.put(level, sum + node.val);

        if(node.left != null) checkSumOfTree(node.left, level + 1);
        if(node.right != null) checkSumOfTree(node.right, level + 1);
    }
}

// bfs 방식. 나보다빠름
    //public int maxLevelSum(TreeNode root) {
    //
    //    int res = 1;
    //    int level = 1;
    //    int maxSum = root.val;
    //
    //    Queue<TreeNode> q = new LinkedList<>();
    //    q.add(root);
    //
    //    while(!q.isEmpty()) {
    //        int size = q.size();
    //        int sum = 0;
    //        for(int i = 0; i < size; i++) {
    //            TreeNode cur = q.remove();
    //
    //            sum += cur.val;
    //
    //            if(cur.left != null) {
    //                q.add(cur.left);
    //            }
    //
    //            if(cur.right != null) {
    //                q.add(cur.right);
    //            }
    //        }
    //
    //        if(maxSum < sum) {
    //            maxSum = sum;
    //            res = level;
    //        }
    //
    //        level++;
    //    }
    //
    //    return res;
    //}