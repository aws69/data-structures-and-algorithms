package stackAndQueue.queue;
import stackAndQueue.Node.Node;
public class Queue<T> {
    Node<T> front;
    Node<T> rear;
    public void enqueue(T data){
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = newNode;
        }else {
            rear.next = newNode;
        }
        rear = newNode;
    }
    public T dequeue() throws IllegalStateException{
        if (isEmpty()) throw new IllegalStateException("Queue is Empty");
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }
    public T peek() throws IllegalStateException{
        if (isEmpty()) throw new IllegalStateException("Queue is Empty");
        return front.data;
    }
    public boolean isEmpty() {
        return front == null;
    }
}
