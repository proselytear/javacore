package ua.epam.javacore.lesson_13.patterns.behavioral.visitor;

public class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
