package reverseLinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @Test
    public void testReverseLinkedList1() {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(3);
        linkedList.head.next = new Node(2);
        linkedList.head.next.next = new Node(1);

        System.out.println("Original Linked List:");
        printLinkedList(linkedList);

        LinkedList reversedList = ReverseLinkedList.reverseLinkedList(linkedList);

        System.out.println("Reversed Linked List:");
        printLinkedList(reversedList);

        assertEquals(1, reversedList.head.value);
        assertEquals(2, reversedList.head.next.value);
        assertEquals(3, reversedList.head.next.next.value);
        assertNull(reversedList.head.next.next.next);
    }

    @Test
    public void testReverseLinkedList2() {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node('a');
        linkedList.head.next = new Node('b');
        linkedList.head.next.next = new Node('c');

        System.out.println("Original Linked List:");
        printLinkedList(linkedList);

        LinkedList reversedList = ReverseLinkedList.reverseLinkedList(linkedList);

        System.out.println("Reversed Linked List:");
        printLinkedList(reversedList);

        assertEquals('c', reversedList.head.value);
        assertEquals('b', reversedList.head.next.value);
        assertEquals('a', reversedList.head.next.next.value);
        assertNull(reversedList.head.next.next.next);
    }

    private void printLinkedList(LinkedList list) {
        Node current = list.head;
        while (current != null) {
            System.out.print("{" + current.value + "} -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
