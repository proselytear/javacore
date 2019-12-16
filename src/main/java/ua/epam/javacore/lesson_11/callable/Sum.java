package ua.epam.javacore.lesson_11.callable;

import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {
    int stop;

    Sum(int v) {
        stop = v;
    }

    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}