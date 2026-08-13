import java.util.Stack;
class MinStack {
private Stack<Integer> stack;
private Stack<Integer> Minstack;
    public MinStack() {
        stack = new Stack<>();
        Minstack = new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(Minstack.isEmpty() || value <= Minstack.peek()){
            Minstack.push(value);
        }
    }
    
    public void pop() {
        if(stack.peek().equals(Minstack.peek())){
            Minstack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return Minstack.peek();
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