class MinStack {
    Deque<Integer> stack;

    public MinStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        Deque<Integer> temp = new ArrayDeque<>(stack);
        int result = Integer.MAX_VALUE;
        while (!temp.isEmpty()) {
            result = Math.min(temp.pop(), result);
        }
        return result;
    }
}
