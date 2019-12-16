package ua.epam.javacore.lesson_11.phaser;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String args[]) {
        Phaser phsr = new Phaser(1);
        int curPhase;
        System.out.println("Starting");
        new MyThread(phsr, "A");
        new MyThread(phsr, "B");
        new MyThread(phsr, "C");
// Wait for all threads to complete phase one.
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " Complete");
// Wait for all threads to complete phase two.
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " Complete");
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " Complete");
        // Deregister the main thread.
        phsr.arriveAndDeregister();
        if(phsr.isTerminated())
            System.out.println("The Phaser is terminated");
    }
}
