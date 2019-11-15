package ua.epam.javacore.lesson_03;

public class BoxWithConstructor {

    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    BoxWithConstructor() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
