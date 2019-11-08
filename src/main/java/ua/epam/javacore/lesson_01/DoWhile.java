package ua.epam.javacore.lesson_01;

public class DoWhile {
    public static void main(String args[]) {
        int n = 10;
        do {
            System.out.println("tick " + n);
            n--;
        } while (n > 0);
    }
}
