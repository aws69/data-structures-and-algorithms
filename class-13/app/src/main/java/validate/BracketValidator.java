package validate;

import java.util.Stack;
public class BracketValidator {
    public static boolean validateBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : input.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (stack.isEmpty()) {
                    return false; // Closing bracket with no matching opening bracket
                }

                char top = stack.pop();

                if ((bracket == ')' && top != '(') ||
                        (bracket == ']' && top != '[') ||
                        (bracket == '}' && top != '{')) {
                    return false; // Mismatched opening and closing brackets
                }
            }
        }

        return stack.isEmpty(); // All opening brackets must be closed
    }
}
