package ua.epam.javacore.lesson_11.semaphore;

import java.util.concurrent.Semaphore;

public class IncThread implements Runnable {
    String name;
    Semaphore sem;
    IncThread(Semaphore s, String n) {
        sem = s;
        name = n;
        new Thread(this).start();
    }
    public void run() {
        System.out.println("Starting " + name);
        try {
            System.out.println(name + " is waiting for a permit.");
            sem.acquire();
            System.out.println(name + " gets a permit.");
            for(int i=0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + ": " + Shared.count);
// Now, allow a context switch -- if possible.
                Thread.sleep(10);
            }
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
// Release the permit.
        System.out.println(name + " releases the permit.");
        sem.release();
    }
}
