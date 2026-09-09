class MinStack {
    Deque<Integer> stack;

    public MinStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        if (stack.isEmpty()) return;
        stack.pop();
    }
    
    public int top() {
        if (stack.isEmpty()) return -1;
        return stack.peek();
    }
    
    public int getMin() {
        if (stack.isEmpty()) return -1;
        int min = Integer.MAX_VALUE;
        Deque<Integer> tempStack = new ArrayDeque<>(stack);
        while (!tempStack.isEmpty()) {
            min = Math.min(tempStack.pop(), min);
        }
        return min;
    }
}
