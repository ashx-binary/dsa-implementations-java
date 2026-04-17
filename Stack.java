class StackArray {
    int max = 100;
    int[] stack = new int[max];
    int top = -1;

    void push(int x) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    int peek() {
        if (top == -1) return -1;
        return stack[top];
    }

    void display() {
        for (int i = top; i >= 0; i--)
            System.out.print(stack[i] + " ");
        System.out.println();
    }
}