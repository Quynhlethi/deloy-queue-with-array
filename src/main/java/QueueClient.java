public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(1);
        queue.dequeue();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(5);
        queue.dequeue();
        queue.enqueue(6);
        queue.dequeue();
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
    }
}
