package ua.epam.javacore.lesson_13.patterns.structural.bridge;

public class BankSystem extends Program{

    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank System development in progress...");
        developer.writeCode();
    }
}
