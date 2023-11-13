import org.example.LeftJoin;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeftJoinTest {

    @Test
    public void testLeftJoinWithMatchingKeys() {
        Map<String, String> synonyms = Map.of("diligent", "employed", "fond", "enamored", "guide", "usher", "outfit", "garb", "wrath", "anger");

        Map<String, String> antonyms = Map.of("diligent", "idle", "fond", "averse", "guide", "follow", "flow", "jam", "wrath", "delight");

        List<List<String>> result = LeftJoin.leftJoin(synonyms, antonyms);

        assertEquals(5, result.size());

        assertTrue(result.contains(Arrays.asList("diligent", "employed", "idle")));
        assertTrue(result.contains(Arrays.asList("fond", "enamored", "averse")));
        assertTrue(result.contains(Arrays.asList("guide", "usher", "follow")));
        assertTrue(result.contains(Arrays.asList("outfit", "garb", null)));
        assertTrue(result.contains(Arrays.asList("wrath", "anger", "delight")));
    }

    @Test
    public void testLeftJoinWithNoMatchingKeys() {
        Map<String, String> synonyms = Map.of("happy", "joyful", "sad", "unhappy", "bright", "vivid");

        Map<String, String> antonyms = Map.of("rich", "poor", "tall", "short", "fast", "slow");

        List<List<String>> result = LeftJoin.leftJoin(synonyms, antonyms);

        assertEquals(3, result.size());
        System.out.println(result);
        assertTrue(result.contains(Arrays.asList("happy", "joyful", null)));
        assertTrue(result.contains(Arrays.asList("sad", "unhappy", null)));
        assertTrue(result.contains(Arrays.asList("bright", "vivid", null)));
    }

    @Test
    public void testLeftJoinWithEmptyMaps() {
        Map<String, String> synonyms = Map.of();
        Map<String, String> antonyms = Map.of();

        List<List<String>> result = LeftJoin.leftJoin(synonyms, antonyms);

        assertEquals(0, result.size());
    }
}