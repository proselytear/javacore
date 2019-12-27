package ua.epam.javacore.lesson_13.patterns.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/proselytear/realProject");

        project.run();
    }
}
