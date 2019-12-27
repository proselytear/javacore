package ua.epam.javacore.lesson_13.patterns.behavioral.observer;

public interface Observed {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
