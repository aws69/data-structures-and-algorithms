# Stack and a Queue Implementation
<!-- Description of the challenge -->
Using a Linked List as the underlying data storage mechanism, implement both a Stack and a Queue

### Node
Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.

### Stack
Create a Stack class that has a top property. It creates an empty Stack when instantiated.
This object should be aware of a default empty value assigned to top when the stack is created.
The class should contain the following methods:
 - push
   - Arguments: value
   - adds a new node with that value to the top of the stack with an O(1) Time performance.

 - pop
   - Arguments: none
   - Returns: the value from node from the top of the stack
   - Removes the node from the top of the stack
   - Should raise exception when called on empty stack
 - peek
   - Arguments: none 
   - Returns: Value of the node located at the top of the stack 
   - Should raise exception when called on empty stack 
 - is empty 
   - Arguments: none 
   - Returns: Boolean indicating whether or not the stack is empty.

### Queue
Create a Queue class that has a front property. It creates an empty Queue when instantiated.
This object should be aware of a default empty value assigned to front when the queue is created.
The class should contain the following methods:
 - enqueue 
    - Arguments: value 
    - adds a new node with that value to the back of the queue with an O(1) Time performance.
- dequeue 
  - Arguments: none 
  - Returns: the value from node from the front of the queue 
  - Removes the node from the front of the queue 
  - Should raise exception when called on empty queue 
- peek
  - Arguments: none 
  - Returns: Value of the node located at the front of the queue 
  - Should raise exception when called on empty stack
- is empty 
  - Arguments: none 
  - Returns: Boolean indicating whether or not the queue is empty



## Whiteboard Process
<!-- Embedded whiteboard image -->
![stack and queue](\\wsl$\Ubuntu\home\aws\data-structures-and-algorithms\class-10\stack%20and%20queue.jpg)


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Easy Implementation: Implementing stacks and queues using linked lists is straightforward and intuitive. Each element (node) in the list points to the next element, which simplifies the push/enqueue and pop/dequeue operations.

Generic Data Type: Using a generic data type (T) allows these data structures to be used with various data types (e.g., integers, strings, custom objects) while maintaining type safety.

Error Handling: I added exception handling to handle cases where you try to pop or dequeue elements from an empty stack or queue, or when you try to peek into an empty data structure. This ensures proper error reporting.
## Solution
<!-- Show how to run your code, and examples of it in action -->
Create a new Java project in your preferred Integrated Development Environment (IDE) or use a code editor such as Visual Studio Code or IntelliJ IDEA.

Copy and paste the code for the Node, Stack, Queue, and Test classes into separate Java files within your project. Make sure the package names match the directory structure in your project.

Run the Test classes .