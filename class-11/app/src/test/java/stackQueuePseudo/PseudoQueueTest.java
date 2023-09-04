package stackQueuePseudo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class PseudoQueueTest {

    private PseudoQueue<Integer> pseudoQueue;

    @BeforeEach
    void setUp() {
        pseudoQueue = new PseudoQueue<>();
    }

    @Test
    void testEnqueueAndDequeue() {
        pseudoQueue.enqueue(10);
        pseudoQueue.enqueue(15);
        pseudoQueue.enqueue(20);

        assertEquals(10, pseudoQueue.dequeue());
        assertEquals(15, pseudoQueue.dequeue());
        assertEquals(20, pseudoQueue.dequeue());
    }

    @Test
    void testEmptyQueueDequeue() {
        assertThrows(EmptyStackException.class, () -> pseudoQueue.dequeue());
    }

    @Test
    void testEnqueueAndDequeueMixed() {
        pseudoQueue.enqueue(10);
        pseudoQueue.enqueue(15);
        pseudoQueue.enqueue(20);

        assertEquals(10, pseudoQueue.dequeue());

        pseudoQueue.enqueue(25);
        pseudoQueue.enqueue(30);

        assertEquals(15, pseudoQueue.dequeue());
        assertEquals(20, pseudoQueue.dequeue());
        assertEquals(25, pseudoQueue.dequeue());
        assertEquals(30, pseudoQueue.dequeue());
    }
}
