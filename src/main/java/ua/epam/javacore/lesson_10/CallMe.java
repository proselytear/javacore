package ua.epam.javacore.lesson_10;

public class CallMe {
    synchronized void call(String msg) {
//    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
