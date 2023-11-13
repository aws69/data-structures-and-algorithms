# Hashmap Left Join
<!-- Description of the challenge -->
Write a function that LEFT JOINs two hashmaps into a single data structure.

Write a function called left join
Arguments: two hash maps
The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
Return: The returned data structure that holds the results is up to you. It doesn’t need to exactly match the output below, so long as it achieves the LEFT JOIN logic
NOTES:

Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.
LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are appended to the result row.
If no values exist in the right hashmap, then some flavor of NULL should be appended to the result row.

## Whiteboard Process
<!-- Embedded whiteboard image -->
![LeftJoin.jpg](..%2F..%2F..%2FDownloads%2FLeftJoin.jpg)
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
The approach taken in the provided Java implementation is straightforward. It iterates over the keys of the synonyms map, creates a row for each key, and checks if the key exists in the antonyms map. If it does, the corresponding value is added to the row; otherwise, null is added.

Time Complexity:
Let's denote n as the number of entries in the synonyms map. The time complexity is O(n) because, in the worst case, we iterate through all entries in the synonyms map.

Space Complexity:
The space complexity is also O(n) because the resulting list (result) contains one entry for each key in the synonyms map. The space complexity is linear with respect to the input size.
## Solution
<!-- Show how to run your code, and examples of it in action -->
To run the code with Gradle and execute the tests, you need to follow these steps:

1. **Create a Gradle Project:**
   If you haven't already, create a new Gradle project. You can do this manually or by using a tool like IntelliJ IDEA.

2. **Organize Your Project Structure:**
   Ensure that your project structure is organized, and your test files are in the appropriate directory. It typically looks like this:

   ```
   /your_project
       /src
           /main
               /java
                   LeftJoin.java
           /test
               /java
                   LeftJoinTest.java
   build.gradle
   ```

3. **Write a `build.gradle` File:**
   Create a `build.gradle` file in the root of your project. This file includes the necessary configurations for your Gradle project, such as dependencies and tasks.

   ```groovy
   plugins {
       id 'java'
   }

   repositories {
       mavenCentral()
   }

   dependencies {
       // Add any necessary dependencies here
       testImplementation platform('org.junit:junit-bom:5.9.1')
    testImplementation 'org.junit.jupiter:junit-jupiter'
   }

   test {
       useJUnit()
   }
   ```

4. **Run Tests with Gradle:**
   Open a terminal, navigate to your project's root directory, and run the following command to execute the tests:

   ```bash
   ./gradlew test
   ```

   If you are using Windows, use `gradlew.bat` instead of `./gradlew`.

5. **Check Test Results:**
   After running the tests, Gradle will generate a report indicating whether the tests passed or failed. Review the output in the terminal to see the results.

