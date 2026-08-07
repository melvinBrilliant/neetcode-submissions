class MinStack {
    Deque<Integer> s;
    Deque<Integer> m;

    public MinStack() {
        s = new ArrayDeque<>();
        m = new ArrayDeque<>();
    }

    public void push(int val) {
        s.push(val);

        if (m.isEmpty() || val <= m.peek()) {
            m.push(val);
        }
    }

    public void pop() {
        int val = s.pop();

        if (val == m.peek()) {
            m.pop();
        }
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return m.peek();
    }
}