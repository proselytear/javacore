package ua.epam.javacore.lesson_03;

public class BoxWithMethodParamDemo {
    public static void main(String[] args) {
        BoxWithMethodParam mybox1 = new BoxWithMethodParam();
        BoxWithMethodParam mybox2 = new BoxWithMethodParam();
        double vol;
// initialize each box
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);
// get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
// get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
