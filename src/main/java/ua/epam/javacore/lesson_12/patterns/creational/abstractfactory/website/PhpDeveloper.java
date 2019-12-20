package ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.website;


import ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
