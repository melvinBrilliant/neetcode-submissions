class LinkedList {
    static class Node {
        int value;
        Node next;

        public Node() {}

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    Node head;
    int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    Node getNode(int index) {
        if (index >= size) {
            return null;
        }
        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int get(int index) {
        Node getNode = getNode(index);
        if (getNode == null)
            return -1;
        else
            return getNode.value;
    }

    public void insertHead(int val) {
        if (this.head == null) {
            this.head = new Node(val);
        } else {
            Node temp = new Node(val, this.head);
            this.head = temp;
        }
        this.size++;
    }

    public void insertTail(int val) {
        Node tail = getNode(this.size - 1);
        if (tail == null) {
            insertHead(val);
            return;
        }
        Node temp = new Node(val);
        tail.next = temp;
        this.size++;
    }

    public boolean remove(int index) {
        Node temp = new Node(0, this.head);
        Node prev = null;
        if (index >= this.size)
            return false;
        if (index == 0) {
            this.head = this.head.next;
            this.size--;
            return true;
        }
        for (int i = 0; i <= index; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp == null ? null : temp.next;
        this.size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<>();
        Node temp = new Node(0, this.head);
        while (temp.next != null) {
            result.add(temp.next.value);
            temp = temp.next;
        }
        return result;
    }
}
