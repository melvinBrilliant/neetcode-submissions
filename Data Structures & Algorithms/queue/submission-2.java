class Deque {
    class Node {
        int value;
        Node prev;
        Node next;

        Node() {}

        Node(int value) {
            this.value = value;
        }
    }

    Node head;
    Node tail;
    int length;

    public Deque() {
        this.length = 0;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public void append(int value) {
        Node temp = new Node(value);
        if (this.length == 0) {
            this.head = temp;
            this.tail = temp;
        } else {
            this.tail.next = temp;
            temp.prev = this.tail;
            this.tail = temp;
        }
        this.length++;
    }

    public void appendleft(int value) {
        Node temp = new Node(value);
        if (this.length == 0) {
            this.head = temp;
            this.tail = temp;
        } else {
            temp.next = this.head;
            this.head.prev = temp;
            this.head = temp;
        }
        this.length++;
    }

    public int pop() {
        if (this.length == 0) {
            return -1;
        }
        if (this.length == 1) {
            this.length = 0;
            Node temp = this.tail;
            this.tail = null;
            this.head = null;
            return temp.value;
        }
        Node prev = this.tail.prev;
        Node temp = this.tail;
        this.tail = prev;
        this.tail.next = null;
        this.length--;
        return temp.value;
    }

    public int popleft() {
        if (this.length == 0) {
            return -1;
        }
        if (this.length == 1) {
            Node temp = this.head;
            this.length = 0;
            this.head = null;
            this.tail = null;
            return temp.value;
        }
        Node temp = this.head;
        Node next = this.head.next;
        this.head = next;
        this.head.prev = null;
        this.length--;
        return temp.value;
    }
}
