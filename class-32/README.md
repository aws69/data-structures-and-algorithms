# Challenge Title
<!-- Description of the challenge -->
Write a function called tree_intersection that takes two binary trees as parameters.
Using your Hashmap implementation as a part of your algorithm, return a set of values found in both trees.

## Whiteboard Process
<!-- Embedded whiteboard image -->
![TreeIntersection.jpg](..%2F..%2F..%2FDownloads%2FTreeIntersection.jpg)
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I used a HashMap to efficiently store values from the first binary tree while traversing it. Then, I traversed the second tree and checked for common values in the HashMap. If a common value was found, it was added to the result set. This approach allowed for quick lookup and identification of common values in both trees.
The time complexity of the solution is O(N), where N is the total number of nodes in the binary trees.
## Solution
<!-- Show how to run your code, and examples of it in action -->
To run the given Java code using Gradle, follow these steps:

1. **Create a Gradle Project:**
   If you haven't already, create a new Gradle project or use an existing one.

2. **Add the Java Class:**
   Copy the `TreeNode` and `TreeIntersection` classes into your project's `src/main/java` directory.

3. **Build and Run the Project:**
   Open a terminal, navigate to your project directory, and run the following Gradle command to build and run the project:

   ```
   gradle run
   ```

   Alternatively, if you want to run the tests, you can use the following command:

   ```
   gradle test
   ```

   This will execute the provided test cases and show the output in the terminal.

4. **View the Results:**
   After running the tests, you should see the output indicating whether the test cases passed or failed. For example:

   ```
   Test Case 1: [1, 2]
   Test Case 2: [5]
   Test Case 3: []
   ```

   These results demonstrate the common values found in the respective binary trees based on the `tree_intersection` function.

