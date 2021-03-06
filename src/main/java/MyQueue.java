public class MyQueue {
    private int capacity;
    private int[] queueArray;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArray = new int[this.capacity];
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow! Unable to add element: " + item);
        } else {
            tail = currentSize;
            queueArray[tail] = item;
            System.out.println("Element " + item + " is pushed to Queue!");
            currentSize++;
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Overflow! Unable to remove element");
        } else{
            System.out.println("Element " + queueArray[head] + " is remove to Queue");
            currentSize--;
            newQueue();
        }
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }
    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    private void newQueue() {
        if (!isQueueEmpty()) {
            for (int index = 0; index < currentSize; index++) {
                queueArray[index] = queueArray[index + 1];
            }
        }
    }


}
