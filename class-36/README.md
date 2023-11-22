# Graph Breadth First
<!-- Description of the challenge -->
Write the following method for the Graph class:

 - breadth first
 - Arguments: Node
 - Return: A collection of nodes in the order they were visited.
 - Display the collection

## Whiteboard Process
<!-- Embedded whiteboard image -->
![CC36.jpg](..%2F..%2F..%2FPictures%2FCC36.jpg)
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### Approach Explanation:

I implemented a breadth-first search (BFS) algorithm to traverse a graph starting from a given node. The graph is represented using an adjacency list where each node holds a list of its neighboring nodes.

The BFS algorithm maintains a queue to keep track of nodes to visit. It visits each node's neighbors iteratively, adding them to the queue if they haven't been visited before. A set is used to track visited nodes to avoid revisiting them.

### Big O Analysis:

- **Time Complexity:** For each node, the algorithm explores all its neighbors once, resulting in a time complexity of O(V + E), where V is the number of vertices (nodes) and E is the number of edges in the graph.
- **Space Complexity:** The space complexity is also O(V + E) due to the usage of data structures like the queue, set, and adjacency list to store nodes and edges. In the worst case, the queue might contain all nodes in the graph.

This approach provides an efficient way to traverse a graph using BFS, ensuring that each node is visited exactly once, and it's optimal for exploring nodes level by level.

## Solution
<!-- Show how to run your code, and examples of it in action -->
1. **Setup Node and Graph Classes:**\
Copy the Node.java and Graph.java classes provided earlier into your Java Gradle project, placing them in the appropriate package directory structure.

2. **Create JUnit Tests:**\
Write JUnit tests to validate the breadthFirst method and ensure its correctness in your project.
For instance, you might create test cases to check if the traversal order is as expected for different graph structures or if the method handles cycles, disconnected nodes, or various edge cases correctly.

3. **Run the Code:**\
   For running JUnit tests using Gradle:
   ```
   ./gradlew test
   ```
   This command will run all the tests defined in your project.
