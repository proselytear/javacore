package ua.epam.javacore.lesson_06;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Map<Character, Character> mappings = new HashMap<>();
        mappings.put('}', '{');
        mappings.put(')', '(');
        mappings.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!mappings.containsKey(c)) {
                stack.push(c);
            } else {
                char topElement = stack.isEmpty() ? '#' : stack.pop();

                if (topElement != mappings.get(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
