package ua.epam.javacore.lesson_13.patterns.behavioral.template;

public class WelcomePage extends WebsiteTemplate{

    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}
