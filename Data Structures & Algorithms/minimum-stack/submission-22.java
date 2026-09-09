class MinStack {
    private List<Integer> stack;

    public MinStack() {
        this.stack = new ArrayList<>();
    }
    
    public void push(int val) {
        this.stack.add(val);
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        if (stack.size() == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (Integer element : stack) {
            min = Math.min(element, min);
        }
        return min;
    }
}
