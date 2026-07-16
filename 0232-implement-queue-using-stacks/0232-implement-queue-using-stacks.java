class MyQueue {
    Stack<Integer> st ;
    Stack<Integer> q;
    public MyQueue() {
        st = new Stack<>();
        q = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    private void move(){
        if(q.isEmpty()){
            while(!st.isEmpty()){
                q.push(st.pop());
            }
        }
    }

    public int pop() {
       move();
        return q.pop();
    }
    
    public int peek() {
        move();
        return q.peek();
    }
    
    public boolean empty() {
        return  st.isEmpty() && q.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */