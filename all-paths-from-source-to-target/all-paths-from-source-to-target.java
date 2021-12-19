class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        pathDfs(graph, 0, ans, path);
        return ans;
    }

    private void pathDfs(int[][] graph, int node, List<List<Integer>> ans, List<Integer> path) {
         if(node == graph.length - 1) {
             ans.add(new ArrayList<>(path));
             return;
         }

        int[] possibleNode = graph[node];
        for (int i = 0; i < possibleNode.length; i++) {
            path.add(possibleNode[i]);
            pathDfs(graph, possibleNode[i], ans, path);
            path.remove(path.size() - 1);
        }
    }
}