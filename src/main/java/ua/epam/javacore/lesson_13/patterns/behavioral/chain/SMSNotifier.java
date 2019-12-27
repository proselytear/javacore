package ua.epam.javacore.lesson_13.patterns.behavioral.chain;

public class SMSNotifier extends Notifier {

    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager:" + message);
    }
}
