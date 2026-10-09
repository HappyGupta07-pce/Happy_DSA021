class MyCircularQueue {

    int front = -1;
    int rear = -1;
    int size;
    int[] que;
    int count = 0;

    public MyCircularQueue(int k) {
        size = k;
        que = new int[size];
    }

    public boolean enQueue(int value) {

        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        que[rear] = value;
        count++;

        return true;
    }

    public boolean deQueue() {

        if (isEmpty()) {
            return false;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }

        count--;

        return true;
    }

    public int Front() {

        if (isEmpty()) {
            return -1;
        }

        return que[front];
    }

    public int Rear() {

        if (isEmpty()) {
            return -1;
        }

        return que[rear];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }
}