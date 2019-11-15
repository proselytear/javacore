package ua.epam.javacore.lesson_03;

public class WorkableChildImpl implements WorkableChild {
    @Override
    public void work() {
        System.out.println("WorkableChildImpl working");
    }

    @Override
    public void showSpecialty() {
        System.out.println(" WorkableChildImpl specialty");
    }
}
