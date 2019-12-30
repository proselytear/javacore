package ua.epam.javacore.lesson_13.patterns.behavioral.observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}
