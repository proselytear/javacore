package ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.banking;


import ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
