package ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.banking;

import ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.Developer;
import ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.ProjectManger;
import ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.ProjectTeamFactory;
import ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.Tester;

public class BankTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getFirstDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Developer getSecondDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManger getProjectManager() {
        return new BankingPM();
    }
}
