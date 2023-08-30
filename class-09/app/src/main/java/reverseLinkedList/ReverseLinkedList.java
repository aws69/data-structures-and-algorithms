package reverseLinkedList;

class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

class LinkedList {
    Node head;
    LinkedList() {
        this.head = null;
    }
}

public class ReverseLinkedList {
    public static LinkedList reverseLinkedList(LinkedList ll) {
        Node previous = null;
        Node current = ll.head;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        ll.head = previous;
        return ll;
    }
}
