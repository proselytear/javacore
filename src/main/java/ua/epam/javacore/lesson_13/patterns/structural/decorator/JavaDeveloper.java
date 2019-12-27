package ua.epam.javacore.lesson_13.patterns.structural.decorator;

public class JavaDeveloper implements Developer{
    @Override
    public String makeJob() {
        return "Write Java code.";
    }
}
