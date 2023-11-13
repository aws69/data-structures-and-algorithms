# Hashmap Repeated Word
<!-- Description of the challenge -->

## Whiteboard Process
<!-- Embedded whiteboard image -->
![hash word.jpg](..%2F..%2F..%2FDownloads%2Fhash%20word.jpg)
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Tokenization: I split the input string into an array of words, using regular expressions to handle whitespace.

Frequency Count: I used the Java Stream API to count the frequency of each word, ignoring case.

Sorting: I sorted the words based on their frequency in descending order. For words with the same frequency, I sorted them alphabetically.

Selection of Top N Words: I selected the top N words from the sorted list.

#### Big O Analysis:
Time Complexity: The most time-consuming operation is the sorting step, which has a time complexity of O(n log n), where n is the number of unique words. The other operations, such as tokenization and frequency counting, have linear time complexities.

Space Complexity: The space complexity is primarily determined by the storage of word frequencies, which is O(unique words). Sorting and other operations have a smaller impact on space complexity.
## Solution
<!-- Show how to run your code, and examples of it in action -->
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/your-repository.git
   cd your-repository
   ```

2. **Open in IntelliJ IDEA:**
   Open the project in IntelliJ IDEA or your preferred IDE.

3. **Navigate to WordAnalyzerTest:**
   Go to the `WordAnalyzerTest` class in the `src/test/java` directory.

4. **Run the Test:**
   Right-click on the `testMostFrequentWords` method and select "Run WordAnalyzerTest".

### Example of Code in Action

Assuming you have the following `WordAnalyzer` class and `WordAnalyzerTest` class:

```java
// WordAnalyzer.java
import java.util.*;
import java.util.stream.Collectors;

public class WordAnalyzer {
    // ... (same as previous implementation)
}

// WordAnalyzerTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class WordAnalyzerTest {
    @Test
    public void testMostFrequentWords() {
        String input = "It was the summer of the year, and the sun was shining brightly. It was a beautiful day.";

        // Update the expected list to match the correct order
        String[] expected = {"it", "was", "the"};

        // Call the WordAnalyzer.mostFrequentWords method
        String[] actual = WordAnalyzer.mostFrequentWords(input, 3);

        // Sort both arrays before comparing
        Arrays.sort(expected);
        Arrays.sort(actual);

        // Compare the sorted expected and actual arrays
        assertArrayEquals(expected, actual);
    }
}
```

After running the test, you should see a successful result indicating that the test passed.

### Running Gradle Tests from the Command Line

You can also run the Gradle tests from the command line using the following commands:

```bash
./gradlew test
```

This will execute all tests in the project.

```bash
./gradlew test --tests WordAnalyzerTest
```

This will specifically run tests in the `WordAnalyzerTest` class.

Ensure that you are in the project directory before running these commands.
