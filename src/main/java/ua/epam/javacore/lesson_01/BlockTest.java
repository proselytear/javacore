package ua.epam.javacore.lesson_01;

public class BlockTest {
    public static void main(String args[]) {
        int x, y;
        y = 20;
        // Much more better
        for (x = 0; x < 10; x++) {
            System.out.println("This is x: " + x);
            System.out.println("This is y: " + y);
            y = y - 2;
        }
    }
}
