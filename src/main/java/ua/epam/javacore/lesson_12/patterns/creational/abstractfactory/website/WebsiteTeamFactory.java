package ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.website;


import ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.Developer;
import ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.ProjectManger;
import ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.ProjectTeamFactory;
import ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getFirstDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Developer getSecondDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManger getProjectManager() {
        return new WebsitePM();
    }
}
