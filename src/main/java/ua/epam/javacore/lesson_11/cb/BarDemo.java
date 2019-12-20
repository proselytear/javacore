package ua.epam.javacore.lesson_11.cb;

import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String args[]) {
        CyclicBarrier cb = new CyclicBarrier(2, new BarAction() );
        System.out.println("Starting");
        new MyThread(cb, "A");
        new MyThread(cb, "B");
        new MyThread(cb, "C");
    }
}
