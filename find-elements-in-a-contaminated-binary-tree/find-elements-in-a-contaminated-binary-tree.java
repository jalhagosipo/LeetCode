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
class FindElements {

    TreeNode root;
        public FindElements(TreeNode root) {
            this.root = root;
            setNode(root, 0);
        }

        public boolean find(int target) {
            return findTarget(target, root);
        }

        private void setNode(TreeNode node, int val) {
            node.val = val;
            if(node.left != null)setNode(node.left, 2 * val + 1);
            if(node.right != null)setNode(node.right, 2 * val + 2);
        }
        
        private boolean findTarget(int target, TreeNode node) {
            if(node.val == target) return true;
            boolean result = false;
            if(node.left != null) result = findTarget(target, node.left);
            if(node.right != null && !result) result = findTarget(target, node.right);
            return result;
        }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */