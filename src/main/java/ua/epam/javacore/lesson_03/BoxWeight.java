package ua.epam.javacore.lesson_03;

public class BoxWeight extends BoxWithParamConstructor {
    double weight; // weight of box

    // initialize width, height, and depth using super()
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // call superclass constructor
        weight = m;
    }
}
