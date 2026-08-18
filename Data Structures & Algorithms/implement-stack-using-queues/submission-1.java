class MyStack {
    class Node {
        int value;
        Node prev;

        Node() {
        }

        Node (int value) {
            this.value = value;
        }
    }

    Node tail;
    int length;

    public MyStack() {
        this.length = 0;
    }
    
    public void push(int x) {
        Node temp = new Node(x);
        temp.prev = this.tail;
        this.tail = temp;
        this.length++;
    }
    
    public int pop() {
        Node temp = this.tail;
        if (this.length == 0) {
            return -1;
        } else if (this.length == 1) {
            this.tail = null;
            this.length--;
            return temp.value;
        }
        Node prev = this.tail.prev;
        this.tail = prev;
        this.length--;
        return temp.value;
    }
    
    public int top() {
        return this.tail.value;
    }
    
    public boolean empty() {
        return this.length == 0;
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