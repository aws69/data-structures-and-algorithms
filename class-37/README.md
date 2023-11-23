# Graph Business Trip
<!-- Description of the challenge -->
- Write a function called business trip
- Arguments: graph, array of city names
- Return: the cost of the trip (if it’s possible) or null (if not)\
Determine whether the trip is possible with direct flights, and how much it would cost.
## Whiteboard Process
<!-- Embedded whiteboard image -->
![Trip Graph.jpg](..%2F..%2F..%2FPictures%2FTrip%20Graph.jpg)
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### Approach and Analysis

The approach taken involves creating a `BusinessTrip` class that contains a method `calculateTripCost`. This method takes a graph representing flight costs between cities and an array of city names, then calculates the total cost of the trip based on the provided graph.

#### Time Complexity
- The time complexity of calculating the trip cost is O(n), where n is the number of cities in the provided array. It iterates through the array of cities, checking for direct flights in the graph for each pair of consecutive cities.

#### Space Complexity
- The space complexity is O(V + E), where V is the number of vertices (cities) and E is the number of edges (direct flight connections) in the graph. This is due to the storage of the flight costs in the HashMap.

## Solution
<!-- Show how to run your code, and examples of it in action -->
### Prerequisites
- Java JDK installed on your system
- Gradle installed or use Gradle wrapper included in the project

### Running the Code

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   ```

2. **Navigate to the Project Directory**:
   ```bash
   cd your-java-gradle-project-directory
   ```

3. **Run the Tests**:
   Run the following command to execute the tests:
   ```bash
   ./gradlew test
   ```

   This command runs the JUnit tests defined in the `BusinessTripTest` class.

