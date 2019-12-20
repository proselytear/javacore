package ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.banking;


import ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking project...");
    }
}
