package Related_Class;

public class Queue {
    //Data fields
    private int[] elements;
    private int size;
    private int maxSize;

    //Constructor
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        elements = new int[this.maxSize];
    }
    public Queue() {
        this(8);
    }

    //Methods
    public void enqueue(int v) { // Add v into the queue
        if (size >= elements.length) {
            int[] temp = new int[size * 2];
            System.arraycopy(elements, 0, temp, 0, size);
            elements = temp;
        }
        elements[size++] = v;
    }
    public int dequeue() { // Remove and return the element from the queue
        int temp = elements[0];
        size--;
        for (int i = 0; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        return temp;
    }
    public boolean empty() { // Return true if the queue is empty
        if (size == 0) {
            return true;
        }
        return false;
    }
    public int getSize() { // Return the size of the queue
        return size;
    }
}
