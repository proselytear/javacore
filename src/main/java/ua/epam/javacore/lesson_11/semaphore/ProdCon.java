package ua.epam.javacore.lesson_11.semaphore;

public class ProdCon {
    public static void main(String args[]) {
        Q q = new Q();
        new Consumer(q);
        new Producer(q);
    }
}
