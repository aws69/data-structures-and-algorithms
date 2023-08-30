# Reversed Linked List
<!-- Description of the challenge -->
Ask the candidate to write a function to validate whether or not a Linked list is palindrome
Help the candidate understand the definition of a Palindrome if he/she is unsure of it.
A palindrome is a word, phrase, number, or sequence of nodes which reads the same backward as forward.
Avoid utilizing any of the built-in methods available in your language.
This problem can be solved using different approaches:
Using a helper data structure (Array or Linked List) to keep track of the nodes.
This method takes O(n) and uses O(n) extra space.
Reversing the Linked List, and checking for equality of the reversed part.


## Whiteboard Process
<!-- Embedded whiteboard image -->
![reversed linked list]("Untitled (2).jpg")

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
The algorithm for reversing a linked list is well-known and efficient. 
It involves iterating through the linked list while maintaining pointers to the current node, its next node, and the previous node. 
By updating these pointers appropriately, we can reverse the direction of links between nodes.

The time complexity of the linked list reversal algorithm is O(n), where n is the number of nodes in the linked list. This is because the algorithm iterates through each node exactly once to reverse the pointers.

The space complexity of this algorithm is O(1), constant space. It uses a constant amount of extra space regardless of the size of the input linked list. The space complexity is not affected by the input size because it only uses a few extra variables (such as previous, current, and next) to perform the reversal, and the amount of memory these variables occupy does not depend on the input size.

In terms of the JUnit testing, the space complexity is negligible compared to the linked list reversal algorithm itself, as it involves printing a few characters to the console for each node. Therefore, the overall space complexity of this entire approach, including the algorithm and testing, remains O(1).
## Solution
<!-- Show how to run your code, and examples of it in action -->
1. Open ReverseLinkedList.java and implement the Node, LinkedList, and ReverseLinkedList classes, as well as the main method if needed.
2. Open ReverseLinkedListTest.java and implement the JUnit test methods as discussed earlier.
3. Open a terminal or command prompt.
4. Navigate to your project root directory (the directory containing the build.gradle file).
5. Run the following command to execute the tests:
   ./gradlew test
