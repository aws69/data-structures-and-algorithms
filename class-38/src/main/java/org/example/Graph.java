package org.example;
import java.util.*;
public class Graph {
    private Map<Node, List<Node>> adjacencyList;
    public Graph() {
        this.adjacencyList = new HashMap<>();
    }
    public void addNode(Node node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }
    public void addEdge(Node source, Node destination) {
        adjacencyList.get(source).add(destination);
    }
    public List<Node> depthFirst(Node start) {
        Set<Node> visited = new HashSet<>();
        List<Node> result = new ArrayList<>();
        depthFirstTraversal(start, visited, result);
        return result;
    }
    private void depthFirstTraversal(Node current, Set<Node> visited, List<Node> result) {
        visited.add(current);
        result.add(current);

        for (Node neighbor : adjacencyList.getOrDefault(current, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                depthFirstTraversal(neighbor, visited, result);
            }
        }
    }
}
