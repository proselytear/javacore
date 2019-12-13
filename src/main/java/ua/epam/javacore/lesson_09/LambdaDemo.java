package ua.epam.javacore.lesson_09;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum = () -> 123.45;
        System.out.println("A fixed value: " + myNum.getValue());
        myNum = () -> Math.random() * 100;
        System.out.println("A random value: " + myNum.getValue());
        System.out.println("Another random value: " + myNum.getValue());
// A lambda expression must be compatible with the method
// defined by the functional interface. Therefore, this won't work:
//        myNum = () -> "123.03"; // Error!
    }
}
