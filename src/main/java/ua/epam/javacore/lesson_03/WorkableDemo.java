package ua.epam.javacore.lesson_03;

public class WorkableDemo {
    public static void main(String[] args) {
        Workable workable = new WorkableImpl();

        workable.count();
        workable.showSpecialty();
        workable.work();
        System.out.println(Workable.i);
    }
}
