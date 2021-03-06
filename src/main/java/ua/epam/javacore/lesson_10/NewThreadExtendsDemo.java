package ua.epam.javacore.lesson_10;

public class NewThreadExtendsDemo {
    public static void main(String args[]) {
        new NewThreadExtends(); // create a new thread
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
