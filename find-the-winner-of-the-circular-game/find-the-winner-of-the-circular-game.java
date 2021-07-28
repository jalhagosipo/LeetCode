class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i<n+1; i++) {
            q.add(i);
        }
        
        int result = 0;
        for(int i=0; i<n; i++) {
            for(int j=1;j<=k;j++) {
                if(j == k) {
                    int data = q.poll();
                    if(i == n-1) result = data;
                } else {
                    q.add(q.poll());
                }
            }
        }
        return result;
    }
}