package ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.website;


import ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.ProjectManger;

public class WebsitePM implements ProjectManger {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
