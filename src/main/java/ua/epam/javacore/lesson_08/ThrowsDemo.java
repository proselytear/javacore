package ua.epam.javacore.lesson_08;

public class ThrowsDemo {
    static void throwOne()
//            throws IllegalAccessException
    {
        System.out.println("Inside throwOne.");
//        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]) {
//        try {
            throwOne();
//        } catch (IllegalAccessException e) {
//            System.out.println("Caught " + e);
//        }
    }
}
