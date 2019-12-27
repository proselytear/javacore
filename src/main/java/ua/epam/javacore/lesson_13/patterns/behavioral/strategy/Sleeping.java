package ua.epam.javacore.lesson_13.patterns.behavioral.strategy;

public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
