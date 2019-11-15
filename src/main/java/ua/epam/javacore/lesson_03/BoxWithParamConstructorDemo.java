package ua.epam.javacore.lesson_03;

public class BoxWithParamConstructorDemo {
    public static void main(String args[]) {

        BoxWithParamConstructor mybox1 = new BoxWithParamConstructor(10, 20, 15);
        BoxWithParamConstructor mybox2 = new BoxWithParamConstructor(3, 6, 9);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
