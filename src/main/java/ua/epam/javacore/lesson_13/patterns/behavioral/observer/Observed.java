package ua.epam.javacore.lesson_13.patterns.behavioral.observer;

public interface Observed {
     void addObserver(Observer observer);

     void removeObserver(Observer observer);

     void notifyObservers();
}
