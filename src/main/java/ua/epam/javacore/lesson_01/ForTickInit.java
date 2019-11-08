package ua.epam.javacore.lesson_01;

public class ForTickInit {
    public static void main(String args[]) {
        // here, n is declared inside of the for loop
        for (int n = 10; n > 0; n--) {
            System.out.println("tick " + n);
        }
    }
}
