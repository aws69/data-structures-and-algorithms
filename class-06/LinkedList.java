class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public void append(int newValue) {
        Node newNode = new Node(newValue);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertBefore(int value, int newValue) {
        Node newNode = new Node(newValue);
        if (head == null) {
            throw new RuntimeException("Linked list is empty");
        }
        if (head.value == value) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.value != value) {
            current = current.next;
        }
        if (current.next == null) {
            throw new RuntimeException("Node with value " + value + " not found");
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void insertAfter(int value, int newValue) {
        Node newNode = new Node(newValue);
        Node current = head;
        while (current != null && current.value != value) {
            current = current.next;
        }
        if (current == null) {
            throw new RuntimeException("Node with value " + value + " not found");
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append("{ ").append(current.value).append(" } -> ");
            current = current.next;
        }
        result.append("NULL");
        return result.toString();
    }

    // Unit tests
    public static class LinkedListTests {

        public static void main(String[] args) {
            testAppend();
            testAppendMultipleNodes();
            testInsertBeforeMiddle();
            testInsertBeforeFirst();
            testInsertAfterMiddle();
            testInsertAfterLast();
        }
    
        private static void testAppend() {
            LinkedList linkedList = new LinkedList();
            linkedList.append(1);
            assert linkedList.head.value == 1;
    
            System.out.println(linkedList.toString());
        }
    
        private static void testAppendMultipleNodes() {
            LinkedList linkedList = new LinkedList();
            linkedList.append(1);
            linkedList.append(2);
            linkedList.append(3);
            assert linkedList.head.value == 1;
            assert linkedList.head.next.value == 2;
            assert linkedList.head.next.next.value == 3;
    
            System.out.println(linkedList.toString());
        }
    
        private static void testInsertBeforeMiddle() {
            LinkedList linkedList = new LinkedList();
            linkedList.append(1);
            linkedList.append(3);
            linkedList.append(4);
    
            linkedList.insertBefore(3, 2);
            assert linkedList.head.value == 1;
            assert linkedList.head.next.value == 2;
            assert linkedList.head.next.next.value == 3;
            assert linkedList.head.next.next.next.value == 4;
    
            System.out.println(linkedList.toString());
        }
    
        private static void testInsertBeforeFirst() {
            LinkedList linkedList = new LinkedList();
            linkedList.append(1);
            linkedList.append(2);
    
            linkedList.insertBefore(1, 0);
            assert linkedList.head.value == 0;
            assert linkedList.head.next.value == 1;
            assert linkedList.head.next.next.value == 2;
    
            System.out.println(linkedList.toString());
        }
    
        private static void testInsertAfterMiddle() {
            LinkedList linkedList = new LinkedList();
            linkedList.append(1);
            linkedList.append(2);
            linkedList.append(4);
    
            linkedList.insertAfter(2, 3);
            assert linkedList.head.value == 1;
            assert linkedList.head.next.value == 2;
            assert linkedList.head.next.next.value == 3;
            assert linkedList.head.next.next.next.value == 4;
    
            System.out.println(linkedList.toString());
        }
    
        private static void testInsertAfterLast() {
            LinkedList linkedList = new LinkedList();
            linkedList.append(1);
            linkedList.append(2);
    
            linkedList.insertAfter(2, 3);
            assert linkedList.head.value == 1;
            assert linkedList.head.next.value == 2;
            assert linkedList.head.next.next.value == 3;
    
            System.out.println(linkedList.toString());
        }
    }
    
}
