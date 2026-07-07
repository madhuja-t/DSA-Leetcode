class MinStack {
    Stack<Integer> inp;
    Stack<Integer> minstk;
    public MinStack() {
        inp = new Stack<>();
        minstk = new Stack<>();
    }
    
    public void push(int value) {
        inp.push(value);
        if(!minstk.isEmpty()){
        int min = Math.min(value,minstk.peek());
        minstk.push(min);
        }
        else{
            minstk.push(value);
        }
    }
    
    public void pop() {
        inp.pop();
        minstk.pop();
    }
    
    public int top() {
        return inp.peek();
    }
    
    public int getMin() {
        if(!minstk.isEmpty()){
            return minstk.peek();
        }
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */