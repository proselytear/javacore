package ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.website;


import ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
