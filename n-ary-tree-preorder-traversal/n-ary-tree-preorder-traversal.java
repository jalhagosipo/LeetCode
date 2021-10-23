/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
   public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        Stack<Node> temp = new Stack<>();
        Stack<Node> stack = new Stack<>();
        if(root != null) stack.add(root);
        while(!stack.isEmpty()) {
            Node node = stack.pop();
            list.add(node.val);
            for(Node child : node.children) {
                temp.add(child);
            }
            while(!temp.isEmpty()) {
                stack.add(temp.pop());
            }
        }
        return list;
    }
}