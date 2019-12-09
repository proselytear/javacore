package ua.epam.javacore.lesson_09;

import java.util.ArrayList;

public class StreamDemo3 {
    public static void main(String[] args) {
// This is now a list of double values.
        ArrayList<Double> myList = new ArrayList<>( );
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        double productOfSqrRoots = myList.parallelStream().reduce(
                1.0,
                (a,b) -> a * Math.sqrt(b),
                (a,b) -> a * b
        );
        System.out.println("Product of square roots: " + productOfSqrRoots);
    }
}
