package ua.epam.javacore.lesson_03;

public interface IA {
    default void test(){
        System.out.println("IA");
    }
}
