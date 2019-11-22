package ua.epam.javacore.lesson_03;

public class UseStatic {
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String args[]) {
        meth(42);
    }

    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
}
