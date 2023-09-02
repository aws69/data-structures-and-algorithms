package stackAndQueue;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import stackAndQueue.queue.Queue;

public class QueueTest {
    @Test
    public void testEnqueue(){
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        assertEquals(1, queue.peek());
    }

    @Test
    public void testEnqueueMultiple() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.peek());
    }

    @Test
    public void testDequeue() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        int dequeuedValue = queue.dequeue();
        assertEquals(1, dequeuedValue);
    }

    @Test
    public void testPeek() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.peek());
    }

    @Test
    public void testEmptyAfterDequeues() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testEmptyQueue() {
        Queue<Integer> queue = new Queue<>();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testDequeueOnEmptyQueue() {
        Queue<Integer> queue = new Queue<>();
        assertThrows(IllegalStateException.class, queue::dequeue);
    }

    @Test
    public void testPeekOnEmptyQueue() {
        Queue<Integer> queue = new Queue<>();
        assertThrows(IllegalStateException.class, queue::peek);
    }
}