import org.example.UniqueCharacters;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UniqueCharactersTest {

    @Test
    void testHasUniqueCharacters() {
        assertFalse(UniqueCharacters.hasUniqueCharacters("The quick brown fox jumps over the lazy dog"));
        assertTrue(UniqueCharacters.hasUniqueCharacters("I love cats"));
        assertFalse(UniqueCharacters.hasUniqueCharacters("Donald the duck"));
    }
}
