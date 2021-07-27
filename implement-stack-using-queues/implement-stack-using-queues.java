class MyStack {

        Queue<Integer> q1;
        Queue<Integer> q2;

        /** Initialize your data structure here. */
        public MyStack() {
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            if(!q1.isEmpty()) {
                q1.add(x);
            } else {
                q2.add(x);
            }
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            int result;

            if(q1.isEmpty()) {
                result = moveData(q1, q2, "pop");
            } else {
                result = moveData(q2, q1, "pop");
            }
            return result;
        }

        /** Get the top element. */
        public int top() {
            int result;

            if(q1.isEmpty()) {
                result = moveData(q1, q2, "top");
            } else {
                result = moveData(q2, q1, "top");
            }
            return result;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        private int moveData(Queue<Integer> q1, Queue<Integer> q2, String type) {
            int result = 0;
            while(!q2.isEmpty()) {
                int data = q2.poll();
                if(q2.isEmpty()) {
                    result = data;
                    if(type.equals("pop")) break;
                }
                q1.add(data);
            }
            return result;
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */