import org.example.WordAnalyzer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WordAnalyzerTest {

    @Test
    void testRepeatedWord() {
        String input = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        String expected = "summer";
        String actual = WordAnalyzer.repeatedWord(input);

        assertEquals(expected, actual);
    }




    @Test
    public void testMostFrequentWords() {
        String input = "It was the summer of the year, and the sun was shining brightly. It was a beautiful day.";

        // Update the expected list to match the correct order
        String[] expected = {"it", "was", "the"};

        // Call the WordAnalyzer.mostFrequentWords method
        String[] actual = WordAnalyzer.mostFrequentWords(input, 3).toArray(new String[0]);

        // Sort both arrays before comparing
        Arrays.sort(expected);
        Arrays.sort(actual);

        // Compare the sorted expected and actual arrays
        assertArrayEquals(expected, actual);
    }
}
