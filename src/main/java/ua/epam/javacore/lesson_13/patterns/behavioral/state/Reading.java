package ua.epam.javacore.lesson_13.patterns.behavioral.state;

public class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Reading book...");
    }
}
