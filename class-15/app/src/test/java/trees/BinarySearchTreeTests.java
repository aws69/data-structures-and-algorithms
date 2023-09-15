package trees;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTests {

    @Test
    public void testEmptyTreeInstantiation() {
        BinarySearchTree bst = new BinarySearchTree();
        assertNull(bst.root);
        System.out.println("Empty Tree Instantiation: " + bst.root);
    }

    @Test
    public void testSingleRootNodeInstantiation() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(50);
        assertNotNull(bst.root);
        assertEquals(50, bst.root.value);
        assertNull(bst.root.left);
        assertNull(bst.root.right);
        System.out.println("Single Root Node Instantiation: " + bst.root.value);
    }

    @Test
    public void testAddLeftAndRightChildren() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(50);
        bst.add(30);
        bst.add(70);

        assertNotNull(bst.root);
        assertEquals(50, bst.root.value);
        assertNotNull(bst.root.left);
        assertEquals(30, bst.root.left.value);
        assertNull(bst.root.left.left);
        assertNull(bst.root.left.right);

        assertNotNull(bst.root.right);
        assertEquals(70, bst.root.right.value);
        assertNull(bst.root.right.left);
        assertNull(bst.root.right.right);
        System.out.println("Add Left and Right Children: " + bst.root.value + ", " + bst.root.left.value + ", " + bst.root.right.value);
    }

    @Test
    public void testPreOrderTraversal() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(50);
        bst.add(30);
        bst.add(70);
        bst.add(20);
        bst.add(40);
        bst.add(60);
        bst.add(80);

        System.out.println("Pre-order Traversal: " + bst.preOrder());
    }

    @Test
    public void testInOrderTraversal() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(50);
        bst.add(30);
        bst.add(70);
        bst.add(20);
        bst.add(40);
        bst.add(60);
        bst.add(80);

        System.out.println("In-order Traversal: " + bst.inOrder());
    }

    @Test
    public void testPostOrderTraversal() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(50);
        bst.add(30);
        bst.add(70);
        bst.add(20);
        bst.add(40);
        bst.add(60);
        bst.add(80);

        System.out.println("Post-order Traversal: " + bst.postOrder());
    }

    @Test
    public void testContains() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(50);
        bst.add(30);
        bst.add(70);
        bst.add(20);
        bst.add(40);
        bst.add(60);
        bst.add(80);

        System.out.println("Contains 50: " + bst.contains(50));
        System.out.println("Contains 20: " + bst.contains(20));
        System.out.println("Contains 90: " + bst.contains(90));
    }
}
