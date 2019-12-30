package ua.epam.javacore.lesson_13.patterns.structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return " Make code review.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
