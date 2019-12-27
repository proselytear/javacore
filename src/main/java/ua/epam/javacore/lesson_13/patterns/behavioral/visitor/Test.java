package ua.epam.javacore.lesson_13.patterns.behavioral.visitor;

public class Test implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
