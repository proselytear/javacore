package ua.epam.javacore.lesson_09;

import java.util.Arrays;
import java.util.List;

public class StreamDemo3 {
    public static void main(String[] args) {
// This is now a list of double values.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
                .stream()
                .reduce(1, (subtotal, element) ->
                        subtotal * element + 1);

        System.out.println(numbers);
        System.out.println(result);
    }
}
