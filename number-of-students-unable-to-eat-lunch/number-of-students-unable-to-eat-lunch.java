class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for(int s : students) {
            q.add(s);
        }
        
        Stack<Integer> st = new Stack<>();
        for(int i = sandwiches.length-1; i > -1; i--) {
            st.add(sandwiches[i]);
        }
        
        while(!q.isEmpty()) {
            int studentSandwich = q.poll();
            int sandwich = st.peek();
            if(studentSandwich == sandwich) {
                st.pop();
            } else {
                q.add(studentSandwich);
                if(!q.contains(sandwich)) {
                    break;
                }
            }
        }
        
        return q.size();
    }
}