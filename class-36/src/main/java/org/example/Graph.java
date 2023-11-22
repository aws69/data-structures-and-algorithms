package org.example;

import java.util.*;

public class Graph {
    private Map<Node, List<Node>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addNode(Node node, List<Node> neighbors) {
        adjacencyList.put(node, neighbors);
    }

    public List<Node> breadthFirst(Node startNode) {
        List<Node> visited = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        Set<Node> seen = new HashSet<>();

        queue.add(startNode);
        seen.add(startNode);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            visited.add(currentNode);

            List<Node> neighbors = adjacencyList.getOrDefault(currentNode, new ArrayList<>());
            for (Node neighbor : neighbors) {
                if (!seen.contains(neighbor)) {
                    queue.add(neighbor);
                    seen.add(neighbor);
                }
            }
        }

        return visited;
    }

}
