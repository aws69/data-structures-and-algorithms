# linked List Zip
<!-- Description of the challenge -->
Write a function called zip lists
Arguments: 2 linked lists
Return: New Linked List, zipped as noted below
Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the zipped list.
Try and keep additional space down to O(1)
You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.

## Whiteboard Process
<!-- Embedded whiteboard image -->
![linked list zip]("\\wsl$\Ubuntu\home\aws\data-structures-and-algorithms\linked-list-zip\ziplist.jpg")

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Node Class: I explained the purpose of the Node class, which is to represent individual nodes in a singly linked list. This class holds an integer data value and a reference to the next node.

LinkedList Class: I explained the purpose of the LinkedList class, its attributes (head), and its methods (insert and zipLists). I provided explanations for how each method works and what it accomplishes.

insert Method: I described how the insert method works by adding new nodes to the end of the linked list. I also pointed out that this method could be improved by maintaining a tail reference.

zipLists Method: I explained the purpose of the zipLists method, which combines two linked lists by alternating nodes from each list. I broke down the logic within this method, including how it handles cases where one list is longer than the other.

Edge Cases and Improvements: I mentioned that the code doesn't handle certain edge cases (e.g., null inputs) and suggested potential improvements, such as using a tail reference for the insert method and handling more edge cases in the zipLists method.

## Solution
<!-- Show how to run your code, and examples of it in action -->
Open a terminal or command prompt.
Navigate to the folder where you saved your Java files.
Compile the code using the javac command:
javac linked/list/zip/*.java
After successful compilation, you should see .class files generated in the same folder.
Run the LinkedList class using the java command:
java linked.list.zip.LinkedList
