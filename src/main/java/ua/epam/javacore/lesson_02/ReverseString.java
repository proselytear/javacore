package ua.epam.javacore.lesson_02;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] input = {'1', '2', '3', '4', '5'};

        System.out.println(Arrays.toString(input));
        reverseString(input);
        System.out.println(Arrays.toString(input));
    }

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}
