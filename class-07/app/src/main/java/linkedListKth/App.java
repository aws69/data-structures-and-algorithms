package linkedListKth;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
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

    public int kthFromEnd(int k) {
        if (head == null || k < 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        Node slow = head;
        Node fast = head;

        // Change the loop condition to k + 1
        for (int i = 0; i < k + 1; i++) {
            if (fast == null) {
                throw new IllegalArgumentException("k is greater than the length of the linked list");
            }
            fast = fast.next;
        }

        while (fast != null) {  // Change the loop condition to fast != null
            slow = slow.next;
            fast = fast.next;
        }

        return slow.value;
    }



    // Stretch goal: Find the middle node
    public int findMiddle() {
        if (head == null) {
            return -1; // or any appropriate default value
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.value;
    }
}
