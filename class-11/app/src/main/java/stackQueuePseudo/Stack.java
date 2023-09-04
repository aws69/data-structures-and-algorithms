package stackQueuePseudo;
import java.util.EmptyStackException;
class Stack<T> {
    Node<T> top;
    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        if (top != null) {
            newNode.next = top;
        }
        top = newNode;
    }
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        return data;
    }
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }



}