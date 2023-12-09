package Lab6;

import Related_Class.Queue;

public class Pro63_64010765 {
    public static void main(String[] args) {
        // Create an object
        Queue queue = new Queue();

        // Add 20 numbers
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }

        // Dequeue all numbers
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
