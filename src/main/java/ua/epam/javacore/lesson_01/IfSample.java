package ua.epam.javacore.lesson_01;

public class IfSample {
    public static void main(String args[]) {
        int x, y;
        x = 10;
        y = 20;

        // Not the best idea -> use block of code
        if (x < y) System.out.println("x is less than y");
        x = x * 2;
        if (x == y) System.out.println("x now equal to y");
        x = x * 2;
        if (x > y) System.out.println("x now greater than y");
        // this won't display anything
        if (x == y) System.out.println("you won't see this");
    }
}