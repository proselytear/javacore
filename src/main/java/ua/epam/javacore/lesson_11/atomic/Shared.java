package ua.epam.javacore.lesson_11.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Shared {
    static AtomicInteger ai = new AtomicInteger(0);
}
