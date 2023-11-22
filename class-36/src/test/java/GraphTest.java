import org.example.Graph;
import org.example.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class GraphTest {

    @Test
    void testBreadthFirstTraversal() {
        Graph graph = new Graph();

        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);

        nodeA.addNeighbor(nodeB);
        nodeA.addNeighbor(nodeC);
        nodeB.addNeighbor(nodeD);
        nodeC.addNeighbor(nodeD);

        graph.addNode(nodeA, nodeA.getNeighbors());
        graph.addNode(nodeB, nodeB.getNeighbors());
        graph.addNode(nodeC, nodeC.getNeighbors());
        graph.addNode(nodeD, nodeD.getNeighbors());

        List<Node> bfsResult = graph.breadthFirst(nodeA);

        System.out.println("BFS Result:");
        for (Node node : bfsResult) {
            System.out.print(node.getValue() + " ");
        }
        System.out.println();

        assertEquals(1, bfsResult.get(0).getValue());
        assertEquals(2, bfsResult.get(1).getValue());
        assertEquals(3, bfsResult.get(2).getValue());
        assertEquals(4, bfsResult.get(3).getValue());
    }

    @Test
    void testBreadthFirstTraversalSingleNode() {
        Graph graph = new Graph();
        Node nodeA = new Node(1);
        graph.addNode(nodeA, nodeA.getNeighbors());

        List<Node> bfsResult = graph.breadthFirst(nodeA);

        System.out.println("BFS Result (Single Node):");
        for (Node node : bfsResult) {
            System.out.print(node.getValue() + " ");
        }
        System.out.println();

        assertEquals(1, bfsResult.size());
        assertEquals(1, bfsResult.get(0).getValue());
    }

    @Test
    void testBreadthFirstTraversalDisconnectedNodes() {
        Graph graph = new Graph();

        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);

        graph.addNode(nodeA, nodeA.getNeighbors());
        graph.addNode(nodeB, nodeB.getNeighbors());
        graph.addNode(nodeC, nodeC.getNeighbors());
        graph.addNode(nodeD, nodeD.getNeighbors());

        List<Node> bfsResult = graph.breadthFirst(nodeA);

        System.out.println("BFS Result (Disconnected Nodes):");
        for (Node node : bfsResult) {
            System.out.print(node.getValue() + " ");
        }
        System.out.println();

        assertEquals(1, bfsResult.size());
        assertEquals(1, bfsResult.get(0).getValue());
    }
}
