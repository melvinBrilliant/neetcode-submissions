class DynamicArray {
    int[] array;
    int size;

    public DynamicArray(int capacity) {
        this.array = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if (size == this.array.length)
            resize();
        this.array[this.size] = n;
        this.size++;
    }

    public int popback() {
        int temp = this.array[this.size - 1];
        this.array[this.size - 1] = 0;
        this.size--;
        return temp;
    }

    private void resize() {
        int[] tempArr = new int[this.array.length * 2];
        for (int i = 0; i < this.array.length; i++) {
            tempArr[i] = this.array[i];
        }
        this.array = tempArr;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.array.length;
    }
}