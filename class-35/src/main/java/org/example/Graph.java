package org.example;

import java.util.*;

public class Graph {
    private final Map<Integer, List<Edge>> adjacencyList;
    private int numVertices;

    public Graph() {
        adjacencyList = new HashMap<>();
        numVertices = 0;
    }

    public int addVertex(int vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            adjacencyList.put(vertex, new ArrayList<>());
            numVertices++; // Increment the count of vertices
        }
        return vertex;
    }


    public void addEdge(int vertex1, int vertex2, int weight) {
        if (!adjacencyList.containsKey(vertex1) || !adjacencyList.containsKey(vertex2)) {
            System.out.println("Vertices not found");
            return;
        }

        adjacencyList.get(vertex1).add(new Edge(vertex2, weight));
        if (vertex1 != vertex2) {
            adjacencyList.get(vertex2).add(new Edge(vertex1, weight)); // For undirected graph
        }
    }


    public Collection<Integer> getVertices() {
        return adjacencyList.keySet();
    }

    public Collection<Edge> getNeighbors(int vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            System.out.println("Vertex not found");
            return new ArrayList<>();
        }
        List<Edge> neighbors = new ArrayList<>(adjacencyList.get(vertex));
        neighbors.removeIf(edge -> edge.destination == vertex); // Exclude self-referential edges
        return neighbors;
    }




    public int size() {
        return numVertices;
    }

    public static class Edge {
        public int destination;
        public int weight;

        public Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Dest: " + destination + ", Weight: " + weight;
        }
    }
}
