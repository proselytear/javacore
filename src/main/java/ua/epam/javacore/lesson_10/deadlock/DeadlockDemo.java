package ua.epam.javacore.lesson_10.deadlock;

public class DeadlockDemo implements Runnable {
    A a = new A();
    B b = new B();

    DeadlockDemo() {
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this, "RacingThread");
        t.start();
        a.foo(b); // get lock on a in this thread.
        System.out.println("Back in main thread");
    }

    public void run() {
        b.bar(a); // get lock on b in other thread.
        System.out.println("Back in other thread");
    }

    public static void main(String args[]) {
        new DeadlockDemo();
    }
}