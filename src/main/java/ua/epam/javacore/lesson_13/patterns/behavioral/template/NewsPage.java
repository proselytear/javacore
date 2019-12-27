package ua.epam.javacore.lesson_13.patterns.behavioral.template;

public class NewsPage extends WebsiteTemplate {
    @Override
    public void showPageContent() {
        System.out.println("News");
    }
}
