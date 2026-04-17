class Deque {
    int max = 5;
    int[] dq = new int[max];
    int front = -1, rear = -1;

    void insertFront(int x) {
        if ((front == 0 && rear == max - 1) || (front == rear + 1)) {
            System.out.println("Deque Full");
            return;
        }
        if (front == -1) {
            front = rear = 0;
        } else if (front == 0) {
            front = max - 1;
        } else {
            front--;
        }
        dq[front] = x;
    }

    void insertRear(int x) {
        if ((front == 0 && rear == max - 1) || (front == rear + 1)) {
            System.out.println("Deque Full");
            return;
        }
        if (rear == -1) {
            front = rear = 0;
        } else if (rear == max - 1) {
            rear = 0;
        } else {
            rear++;
        }
        dq[rear] = x;
    }

    int deleteFront() {
        if (front == -1) {
            System.out.println("Deque Empty");
            return -1;
        }
        int val = dq[front];
        if (front == rear) {
            front = rear = -1;
        } else if (front == max - 1) {
            front = 0;
        } else {
            front++;
        }
        return val;
    }

    int deleteRear() {
        if (rear == -1) {
            System.out.println("Deque Empty");
            return -1;
        }
        int val = dq[rear];
        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = max - 1;
        } else {
            rear--;
        }
        return val;
    }
}