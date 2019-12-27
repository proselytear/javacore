package ua.epam.javacore.lesson_13.patterns.structural.decorator;

public class JavaTeamLead extends DeveloperDecorator {

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Send week report to customer.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
