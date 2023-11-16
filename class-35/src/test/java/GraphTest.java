import org.example.Graph;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GraphTest {
    @Test
    void testAddVertex() {
        Graph graph = new Graph();
        graph.addVertex(1);
        graph.addVertex(2);

        assertEquals(2, graph.size());
    }

    @Test
    void testAddEdge() {
        Graph graph = new Graph();
        int vertex1 = graph.addVertex(1);
        int vertex2 = graph.addVertex(2);

        graph.addEdge(vertex1, vertex2, 5);

        assertTrue(graph.getNeighbors(vertex1).stream().anyMatch(edge -> edge.destination == vertex2 && edge.weight == 5));
        assertTrue(graph.getNeighbors(vertex2).stream().anyMatch(edge -> edge.destination == vertex1 && edge.weight == 5));
    }

    @Test
    void testGetVertices() {
        Graph graph = new Graph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        assertEquals(3, graph.getVertices().size());
    }

    @Test
    void testGetNeighbors() {
        Graph graph = new Graph();
        int vertex1 = graph.addVertex(1);
        int vertex2 = graph.addVertex(2);
        graph.addEdge(vertex1, vertex2, 5);

        assertEquals(1, graph.getNeighbors(vertex1).size());
        assertEquals(1, graph.getNeighbors(vertex2).size());

        assertEquals(5, graph.getNeighbors(vertex1).iterator().next().weight);
        assertEquals(5, graph.getNeighbors(vertex2).iterator().next().weight);
    }

    @Test
    void testGraphSizeWithSingleVertexAndEdge() {
        Graph graph = new Graph();
        int vertex = graph.addVertex(1);
        graph.addEdge(vertex, vertex, 10);

        assertEquals(1, graph.size());
    }
}

