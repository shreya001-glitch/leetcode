class MinStack {
    Stack<Integer> normalStck;
    Stack<Integer> minStck;

    public MinStack() {
        normalStck=new Stack<>();
        minStck=new Stack<>();
    }
    
    public void push(int value) {
        normalStck.push(value);
        if(minStck.isEmpty()||minStck.peek()>=value)
        {
            minStck.push(value);
        }
    }
    
    public void pop() {
        int temp=normalStck.pop();
        if(temp==minStck.peek())
        {
            minStck.pop();
        }
    }
    
    public int top() {
        return normalStck.peek();
    }
    
    public int getMin() {
        return minStck.peek();
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