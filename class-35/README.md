# Graphs
<!-- Description of the challenge -->
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

- `addVertex(value)`
    - **Arguments:** `value`
    - **Returns:** The added vertex
    - *Description:* Adds a vertex to the graph.

- `addEdge(vertex1, vertex2, weight?)`
    - **Arguments:** `vertex1`, `vertex2`, `weight (optional)`
    - **Returns:** Nothing
    - *Description:* Adds a new edge between two vertices in the graph. If specified, assigns a weight to the edge. Both vertices should already be in the Graph.

- `getVertices()`
    - **Arguments:** None
    - **Returns:** Collection of all vertices in the graph
    - *Description:* Returns all the vertices in the graph as a collection. Returns an empty collection if there are no vertices.

- `getNeighbors(vertex)`
    - **Arguments:** `vertex`
    - **Returns:** Collection of edges connected to the given vertex
    - *Description:* Returns a collection of edges connected to the given vertex. Includes the weight of the connection in the returned collection. Returns an empty collection if there are no vertices.

- `size()`
    - **Arguments:** None
    - **Returns:** Total number of vertices in the graph
    - *Description:* Returns the total number of vertices in the graph. Returns 0 if there are none.
## Whiteboard Process
<!-- Embedded whiteboard image -->
![graph.jpg](..%2F..%2F..%2FPictures%2Fgraph.jpg)
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

I utilized an adjacency list representation for the graph. In this implementation:

- **Vertices**: Stored as keys in a HashMap, allowing for quick access to vertices and their corresponding edges.
- **Edges**: Represented using a nested class `Edge`, containing destination vertex and weight.
- **Adding Vertices**: Utilizes a HashMap to store vertices and their associated empty lists for edges.
- **Adding Edges**: Appends new edges to the adjacency lists of both connected vertices.
- **Getting Vertices**: Retrieves all vertices by accessing the keys of the HashMap.
- **Getting Neighbors**: Retrieves the adjacent vertices and their weights for a given vertex.
- **Size**: Maintains a count of vertices.

### Big O Analysis

- **Time Complexity**:
    - Adding Vertex: O(1)
    - Adding Edge: O(1)
    - Getting Vertices: O(V) where V is the number of vertices
    - Getting Neighbors: O(E) where E is the number of edges connected to the vertex
    - Size: O(1)

- **Space Complexity**:
    - The space complexity is O(V + E), where V is the number of vertices and E is the number of edges. The adjacency list requires space proportional to the number of vertices and edges in the graph.

## Solution
<!-- Show how to run your code, and examples of it in action -->
Certainly! Below is a guide on how to create a Java project using Gradle, including the implementation of the graph and examples of its usage:

### Setting up the Project

1. **Create a new Gradle project**:

   ```bash
   mkdir GraphProject
   cd GraphProject
   gradle init --type java-application
   ```
2. **Create a new Java class called `Graph`** and copy the implementation of the graph provided earlier into this class.

### Running the Application

To run the application, execute the following command in the terminal:

```bash
./gradlew run
```

This command compiles and executes the Java application. You should see the output from the `Main` class, demonstrating the addition of vertices, edges with weights, retrieving vertices, getting neighbors of a vertex, and the size of the graph.

Make sure to replace the content of `Main.java` with the provided example code.