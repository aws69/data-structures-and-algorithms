# Graph Depth First
<!-- Description of the challenge -->
Write the following method for the Graph class:

- **Name**: Depth first
- **Arguments**: Node (Starting point of search)
- **Return**: A collection of nodes in their pre-order depth-first traversal order
- **Program output**: Display the collection
## Whiteboard Process
<!-- Embedded whiteboard image -->
![Untitled (2).jpg](..%2F..%2F..%2FPictures%2FUntitled%20%282%29.jpg)
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### Approach Explanation

I implemented a graph using an adjacency list representation. Each node in the graph is represented by a `Node` class, and the relationships between nodes are maintained through an `adjacencyList` map in the `Graph` class.

The `depthFirst` method performs a depth-first traversal starting from a given node by utilizing recursion. It uses a `Set` to track visited nodes and a `List` to store the nodes in their pre-order depth-first traversal order.

The `depthFirstTraversal` method recursively explores adjacent nodes of the current node, adding them to the result list if they have not been visited before.

### Big O Analysis

- Time Complexity:
    - The time complexity of the depth-first traversal in this implementation is O(V + E), where V is the number of vertices (nodes) and E is the number of edges in the graph.
    - This is because, in the worst case, the algorithm may visit every node and traverse every edge once.

- Space Complexity:
    - The space complexity is O(V), where V is the number of vertices in the graph.
    - The space is occupied by the visited set and the result list during the traversal.
    - In the worst case, where all nodes are visited, the visited set and the result list would collectively take O(V) space.

This implementation uses a standard depth-first search algorithm, leveraging recursion to traverse the graph efficiently while keeping track of visited nodes to avoid infinite loops.
## Solution
<!-- Show how to run your code, and examples of it in action -->

### Running the Code

1. **Clone the repository**: Clone this repository or create a directory structure as mentioned above.

2. **Build the Project**: Run the following command to build the project and create the JAR file:

   ```bash
   gradle build
   ```

3. **Run the Program**: Execute the JAR file with the following command:

   ```bash
   java -jar build/libs/your_project.jar
   ```

### Example Output

Suppose the graph has nodes connected as follows:

```
Node A -> Node B, Node C
Node B -> Node D
Node C -> Node E
```

The depth-first traversal starting from Node A will output:

```
Depth-First Traversal starting from node A:
1 2 4 3 5
```

This output demonstrates the order in which the nodes are visited in a depth-first traversal starting from Node A in the provided graph. Adjust the graph connections and starting node in the `Main.java` file to see different traversal orders.