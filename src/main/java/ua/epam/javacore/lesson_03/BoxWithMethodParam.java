package ua.epam.javacore.lesson_03;

public class BoxWithMethodParam {
    double width;
    double height;
    double depth;

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
    // sets dimensions of box
    void setDim(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
