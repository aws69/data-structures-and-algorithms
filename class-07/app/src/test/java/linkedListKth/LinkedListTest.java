package linkedListKth;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    private LinkedList ll;

    @BeforeEach
    void setUp() {
        ll = new LinkedList();
    }

    @Test
    void testKthFromEndGreaterThanLength() {
        ll.append(1);
        ll.append(3);
        ll.append(8);

        assertThrows(IllegalArgumentException.class, () -> {
            ll.kthFromEnd(6);
        });
    }

    @Test
    void testKthFromEndSameAsLength() {
        ll.append(1);
        ll.append(3);
        ll.append(8);

        assertThrows(IllegalArgumentException.class, () -> {
            ll.kthFromEnd(3);
        });
    }

    @Test
    void testKthFromEndNegativeK() {
        ll.append(1);
        ll.append(3);
        ll.append(8);

        assertThrows(IllegalArgumentException.class, () -> {
            ll.kthFromEnd(-1);
        });
    }

    @Test
    void testKthFromEndSizeOne() {
        ll.append(5);

        assertEquals(5, ll.kthFromEnd(0));
    }

    @Test
    void testKthFromEndMiddle() {
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);

        assertEquals(30, ll.kthFromEnd(1));
    }

//    @Test
//    void testFindMiddleEvenSize() {
//        ll.append(10);
//        ll.append(20);
//        ll.append(30);
//        ll.append(40);
//
//        assertEquals(20, ll.findMiddle()); // Compare with the value, not the index
//    }


    @Test
    void testFindMiddleOddSize() {
        ll.append(10);
        ll.append(20);
        ll.append(30);

        assertEquals(20, ll.findMiddle());
    }
}
