package ua.epam.javacore.lesson_03;

public class Outer {
    int outer_x = 100;
    void test() {
        Inner inner = new Inner();
        inner.display();
    }
    // this is an inner class

    class Inner {
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}
