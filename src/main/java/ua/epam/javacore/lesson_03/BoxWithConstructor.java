package ua.epam.javacore.lesson_03;

public class BoxWithConstructor {

    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    BoxWithConstructor() {
        System.out.println("Constructing Box");
        this.width = 10;
        this.height = 10;
        this.depth = 10;
    }

    // compute and return volume
    double volume() {
        return this.width * this.height * this.depth;
    }
}
