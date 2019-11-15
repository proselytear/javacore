package ua.epam.javacore.lesson_03;

public class BoxWithMethodDemo {
    public static void main(String[] args) {
        BoxWithMethod mybox1 = new BoxWithMethod();
        BoxWithMethod mybox2 = new BoxWithMethod();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        mybox1.volume();
        mybox2.volume();
    }
}
