# Tree Breadth First
<!-- Description of the challenge -->

    Write a function called breadth first
    Arguments: tree
    Return: list of all values in the tree, in the order they were encountered

## Whiteboard Process
<!-- Embedded whiteboard image -->
![tree trav.jpg](tree%20trav.jpg)
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I implemented a breadth-first traversal of the tree using a queue data structure in Java. Here's why this approach was chosen:

**Approach**:
1. We start with the root node and enqueue it into a queue.
2. While the queue is not empty, we repeatedly dequeue a node, process it (in this case, adding its value to the result list), and enqueue its child nodes.
3. This process continues until the queue is empty, ensuring that nodes are processed in the order they were encountered.

**Reason for the Approach**:
The breadth-first search (BFS) algorithm is used because it explores all nodes at the current depth before moving on to nodes at the next depth. This ensures that we visit nodes level by level, making it perfect for tasks like printing the values of a tree in the order they were encountered.

**Time Complexity**:
The time complexity of this BFS approach is O(N), where N is the number of nodes in the tree. In the worst case, we need to visit all nodes once.

**Space Complexity**:
The space complexity is also O(N), where N is the maximum number of nodes that can be present in the queue at any point during the traversal. In the worst case, when the tree is completely unbalanced and has only one child per node, the queue can hold all N nodes at once, leading to O(N) space complexity.
## Solution
<!-- Show how to run your code, and examples of it in action -->
To run the Java code I provided for the breadth-first traversal of a tree, you can follow these steps:

1. Create a Java file (e.g., `TreeTraversal.java`) and paste the code into the file.

2. Compile the Java file using the `javac` command in your terminal:

   ```
   javac TreeTraversal.java
   ```

3. Run the compiled Java program:

   ```
   java TreeTraversal
   ```

Here's an example of the code in action using the provided sample tree:

```java
 public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(9);
        TreeNode node7 = new TreeNode(5);
        TreeNode node8 = new TreeNode(11);
        TreeNode node9 = new TreeNode(4);

        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);
        node2.children.add(node5);
        node2.children.add(node6);
        node2.children.add(node7);
        node2.children.add(node8);
        node2.children.add(node9);

        List<Integer> result = breadthFirst(root);


        for (int value : result) {
        System.out.print(value + " ");
        }
}
```

When you run this code, it will perform a breadth-first traversal of the sample tree and print the result:

```
Breadth-First Traversal Result:
2,7,5,2,6,9,5,11,4
```

The output shows the values of the tree nodes in the order they were encountered during the breadth-first traversal.
