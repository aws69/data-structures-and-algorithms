package stackAndQueue;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import stackAndQueue.stack.Stack;
import java.util.EmptyStackException;


public class StackTest {
    @Test
    public void testPush(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        assertEquals(1, stack.peek());
    }

    @Test
    public void testPushMultiple(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.peek());
    }

    @Test
    public void testPop(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        int poppedValue = stack.pop();
        assertEquals(1, poppedValue);
    }

    @Test
    public void testEmptyAfterPops(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.peek());
    }

    @Test
    public void testEmptyStack() {
        Stack<Integer> stack = new Stack<>();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPopOnEmptyStack() {
        Stack<Integer> stack = new Stack<>();
        assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    public void testPeekOnEmptyStack() {
        Stack<Integer> stack = new Stack<>();
        assertThrows(EmptyStackException.class, stack::peek);
    }
}