package validate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BracketValidatorTest {

    @Test
    public void testValidBrackets() {
        String input1 = "()[]{}";
        assertTrue(BracketValidator.validateBrackets(input1));
        System.out.println("Test 1: " + input1 + " - Expected: true - Actual: true");

        String input2 = "([{}])";
        assertTrue(BracketValidator.validateBrackets(input2));
        System.out.println("Test 2: " + input2 + " - Expected: true - Actual: true");
    }

    @Test
    public void testInvalidBrackets() {
        String input3 = "([)]";
        assertFalse(BracketValidator.validateBrackets(input3));
        System.out.println("Test 3: " + input3 + " - Expected: false - Actual: false");
    }
}

