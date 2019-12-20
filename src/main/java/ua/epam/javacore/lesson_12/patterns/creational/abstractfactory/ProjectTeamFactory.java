package ua.epam.javacore.lesson_12.patterns.creational.abstractfactory;

public interface ProjectTeamFactory {
    Developer getFirstDeveloper();

    Developer getSecondDeveloper();

    Tester getTester();

    ProjectManger getProjectManager();
}
