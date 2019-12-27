package ua.epam.javacore.lesson_13.patterns.behavioral.state;

public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
