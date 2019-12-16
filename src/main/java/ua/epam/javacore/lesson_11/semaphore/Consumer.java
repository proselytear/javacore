package ua.epam.javacore.lesson_11.semaphore;

public class Consumer implements Runnable {
    Q q;
    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    public void run() {
        for(int i=0; i < 20; i++) q.get();
    }
}