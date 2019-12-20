package ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.banking;


import ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.ProjectManger;

public class BankingPM implements ProjectManger {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
