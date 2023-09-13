package maxStack;

import java.util.Stack;

public class MaxStack {
    public static int findMax(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }

        Integer largest = null;

        while (!stack.isEmpty()) {
            Integer current = stack.pop();

            if (largest == null || current > largest) {
                largest = current;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        int max = findMax(stack);
        System.out.println("The largest value in the stack is: " + max);
    }
}
