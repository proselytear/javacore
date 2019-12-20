package ua.epam.javacore.lesson_12.patterns.creational.abstractfactory;


import ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.banking.BankTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankTeamFactory();
        Developer teamLead = projectTeamFactory.getFirstDeveloper();
        Developer developer = projectTeamFactory.getSecondDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManger projectManger = projectTeamFactory.getProjectManager();

        System.out.println("Creating banking project...");

        teamLead.writeCode();
        developer.writeCode();
        tester.testCode();
        projectManger.manageProject();
    }
}
