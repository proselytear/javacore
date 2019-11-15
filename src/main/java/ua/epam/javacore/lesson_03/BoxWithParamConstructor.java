package ua.epam.javacore.lesson_03;

public class BoxWithParamConstructor {

    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    BoxWithParamConstructor(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
