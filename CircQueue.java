class CircQueue {
    int max = 5;
    int[] queue = new int[max];
    int front = -1, rear = -1;

    void enqueue(int x) {
        if ((rear + 1) % max == front) {
            System.out.println("Queue Full");
            return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % max;
        queue[rear] = x;
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("Queue Empty");
            return -1;
        }
        int val = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }
        return val;
    }

    void display() {
        if (front == -1) return;

        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % max;
        }
        System.out.println();
    }
}