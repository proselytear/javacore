package ua.epam.javacore.lesson_11.semaphore;

public class Producer implements Runnable {
    Q q;
    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }
    public void run() {
        for(int i=0; i < 20; i++) q.put(i);
    }
}