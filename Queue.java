class Queue {
    int max = 100;
    int[] queue = new int[max];
    int front = 0, rear = -1;

    void enqueue(int x) {
        if (rear == max - 1) {
            System.out.println("Queue Full");
            return;
        }
        queue[++rear] = x;
    }

    int dequeue() {
        if (front > rear) {
            System.out.println("Queue Empty");
            return -1;
        }
        return queue[front++];
    }

    void display() {
        for (int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }
}