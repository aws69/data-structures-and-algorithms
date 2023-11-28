import org.example.Graph;
import org.example.Node;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {

    @Test
    public void testAddNode() {
        Graph graph = new Graph();
        Node nodeA = new Node(1);
        graph.addNode(nodeA);

        List<Node> traversal = graph.depthFirst(nodeA);
        printTraversal(traversal);
        assertTrue(traversal.contains(nodeA));
    }

    @Test
    public void testAddEdge() {
        Graph graph = new Graph();
        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addEdge(nodeA, nodeB);

        List<Node> traversal = graph.depthFirst(nodeA);
        printTraversal(traversal);
        assertTrue(traversal.contains(nodeA));
        assertTrue(traversal.contains(nodeB));
    }

    @Test
    public void testDepthFirstTraversal() {
        Graph graph = new Graph();
        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addEdge(nodeA, nodeB);
        graph.addEdge(nodeA, nodeC);

        List<Node> traversal = graph.depthFirst(nodeA);
        printTraversal(traversal);
        assertEquals(3, traversal.size());
    }

    private void printTraversal(List<Node> traversal) {
        System.out.println("Depth-First Traversal:");
        for (Node node : traversal) {
            System.out.print(node.getValue() + " ");
        }
        System.out.println();
    }
}
