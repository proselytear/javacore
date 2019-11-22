package ua.epam.javacore.lesson_03;

public interface Workable {

    int i = 100_500;

    void work();

    void showSpecialty();

    default void count(){
        System.out.println("count method ...");
    }
}
