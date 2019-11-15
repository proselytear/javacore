package ua.epam.javacore.lesson_03;

public class BoxWithMethodReturnDemo {
    public static void main(String args[]) {
        BoxWithMethodReturn mybox1 = new BoxWithMethodReturn();
        BoxWithMethodReturn mybox2 = new BoxWithMethodReturn();
        double vol;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
