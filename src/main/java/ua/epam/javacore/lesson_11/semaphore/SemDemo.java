package ua.epam.javacore.lesson_11.semaphore;

import java.util.concurrent.Semaphore;

public class SemDemo {
    public static void main(String args[]) {
        Semaphore sem = new Semaphore(1);
        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}
