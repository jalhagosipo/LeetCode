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
   public TreeNode sortedArrayToBST(int[] nums) {

        return makeArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode makeArrayToBST(int[] nums, int start, int end) {
         if(start > end) return null;
         int middle = (start + end) % 2 == 0 ? (start + end) / 2 : (start + end) / 2 + 1;
        TreeNode root = new TreeNode(nums[middle]);

        root.left = makeArrayToBST(nums, start, middle - 1);
        root.right = makeArrayToBST(nums, middle + 1, end);

        return root;
    }
}