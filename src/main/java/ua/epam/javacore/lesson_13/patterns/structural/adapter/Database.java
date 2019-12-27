package ua.epam.javacore.lesson_13.patterns.structural.adapter;

public interface Database {
    void insert();

    void update();

    void select();

    void remove();
}