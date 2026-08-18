class MyLinkedList {
    class Node {
        int value;
        Node next;
        Node prev;

        Node() {
        }

        Node (int value) {
            this.value = value;
        }
    }

    Node head;
    Node tail;
    int length;

    public MyLinkedList() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    Node getNode(int index) {
        if (index >= length || index < 0) {
            return new Node(-1);
        }
        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    
    public int get(int index) {
        return getNode(index).value;
    }
    
    public void addAtHead(int val) {
        Node temp = new Node(val);
        if (this.length == 0) {
            this.head = temp;
            this.tail = temp;
            this.length++;
            return;
        }
        temp.next = this.head;
        this.head.prev = temp;
        this.head = temp;
        this.length++;
    }
    
    public void addAtTail(int val) {
        Node temp = new Node(val);
        if (this.length == 0) {
            this.head = temp;
            this.tail = temp;
            this.length++;
            return;
        }
        this.tail.next = temp;
        temp.prev = this.tail;
        this.tail = temp;
        this.length++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index == this.length) {
            addAtTail(val);
            return;
        } else if (index > this.length) {
            return;
        } else if (index == 0) {
            addAtHead(val);
            return;
        }
        Node get = getNode(index);
        Node prev = get.prev;
        Node temp = new Node(val);
        temp.prev = prev;
        temp.next = get;
        prev.next = temp;
        get.prev = temp;
        this.length++;
    }

    void removeHead() {
        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node next = this.head.next;
            this.head.next = null;
            this.head = next;
            next.prev = null;
        }
        this.length--;
    }

    void removeTail() {
        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node prev = this.tail.prev;
            this.tail.prev = null;
            this.tail = prev;
            prev.next = null;
        }
        this.length--;
    }
    
    public void deleteAtIndex(int index) {
        if (index == 0) {
            removeHead();
        } else if (index == this.length - 1) {
            removeTail();
        } else if (index < 0 || index >= this.length) {
            return;
        } else {
            Node get = getNode(index);
            Node prev = get.prev;
            Node after = get.next;
            prev.next = after;
            after.prev = prev;
            get.prev = null;
            get.next = null;
            this.length--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */