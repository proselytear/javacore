package ua.epam.javacore.lesson_01;

public class ForTest {
    public static void main(String args[]) {
        int x;

        // Not the best idea -> use block of code
        for(x = 0; x<10; x = x+1)
            System.out.println("This is x: " + x);
    }
}
