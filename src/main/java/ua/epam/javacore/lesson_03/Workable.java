package ua.epam.javacore.lesson_03;

public interface Workable {

    public static final int i = 100_500;

    public void work();

    public void showSpecialty();

    public default void count(){
        System.out.println("count method ...");
    }
}
