package ua.epam.javacore.lesson_02;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String input = "Hello world";
        int result = lengthOfLastWord(input);

        System.out.println("Input: " + input);
        System.out.println("result: " + result);
    }

    public static int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int counter = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (counter > 0 && s.charAt(i) == ' ') {
                break;
            }

            if (s.charAt(i) != ' ') {
                counter++;
            }
        }

        return counter;
    }
}
