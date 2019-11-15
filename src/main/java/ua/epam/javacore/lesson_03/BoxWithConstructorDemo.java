package ua.epam.javacore.lesson_03;

public class BoxWithConstructorDemo {
    public static void main(String args[]) {
// declare, allocate, and initialize Box objects
        BoxWithConstructor mybox1 = new BoxWithConstructor();
        BoxWithConstructor mybox2 = new BoxWithConstructor();
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
