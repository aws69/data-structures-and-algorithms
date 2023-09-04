package stackQueuePseudo;

import java.util.EmptyStackException;
class PseudoQueue<T> {
    private final Stack<T> stack1;
    private final Stack<T> stack2;

    public PseudoQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(T value) {
        stack1.push(value);
    }

    public T dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new EmptyStackException();
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }
}