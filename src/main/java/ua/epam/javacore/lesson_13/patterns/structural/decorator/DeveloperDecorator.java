package ua.epam.javacore.lesson_13.patterns.structural.decorator;

public class DeveloperDecorator implements Developer {

    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
