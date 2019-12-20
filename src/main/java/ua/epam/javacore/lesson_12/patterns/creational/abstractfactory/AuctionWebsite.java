package ua.epam.javacore.lesson_12.patterns.creational.abstractfactory;


import ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.website.WebsiteTeamFactory;

public class AuctionWebsite {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer teamLead = projectTeamFactory.getFirstDeveloper();
        Developer developer = projectTeamFactory.getSecondDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManger projectManger = projectTeamFactory.getProjectManager();

        System.out.println("Creating website project...");
        teamLead.writeCode();
        developer.writeCode();
        tester.testCode();
        projectManger.manageProject();
    }
}
