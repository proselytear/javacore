package ua.epam.javacore.lesson_03;

public interface WorkableChild extends Workable {

    public default void childMethod(){
        System.out.println("CHILD METHOD");
    }

    @Override
    default void count() {
        System.out.println("count child ...");
    }
}
