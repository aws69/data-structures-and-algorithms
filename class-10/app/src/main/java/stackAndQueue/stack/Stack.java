package stackAndQueue.stack;

import stackAndQueue.Node.Node;

import java.util.EmptyStackException;
public class Stack<T> {
    Node<T> top;
    public void push(T data){
    Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            top = newNode;
        }else {
            newNode.next = top;
        }
    }
    public T pop() throws EmptyStackException{
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        return data;
    }
    public T peek() throws EmptyStackException{
        if (isEmpty()) throw new EmptyStackException();
        return top.data;
    }
    public boolean isEmpty(){
        return top == null;
    }
}
