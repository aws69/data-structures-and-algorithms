class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public boolean includes(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
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

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Test 1: Can successfully instantiate an empty linked list
        System.out.println("Test 1: Empty Linked List: " + linkedList.toString());

        // Test 2: Can properly insert into the linked list
        linkedList.insert(3);
        System.out.println("Test 2: Insert single node: " + linkedList.toString());

        // Test 3: The head property will properly point to the first node
        linkedList.insert(2);
        linkedList.insert(1);
        System.out.println("Test 3: Head points to the first node: " + linkedList.toString());

        // Test 4: Can properly insert multiple nodes into the linked list
        linkedList.insert(4);
        linkedList.insert(5);
        System.out.println("Test 4: Insert multiple nodes: " + linkedList.toString());

        // Test 5: Will return true when finding a value within the linked list that exists
        System.out.println("Test 5: Value exists (2): " + linkedList.includes(2));

        // Test 6: Will return false when searching for a value that does not exist
        System.out.println("Test 6: Value does not exist (6): " + linkedList.includes(6));

        // Test 7: Can properly return a collection of all the values in the linked list
        System.out.println("Test 7: All values in the linked list: " + linkedList.toString());
    }
}
