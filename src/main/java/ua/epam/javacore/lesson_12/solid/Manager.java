package ua.epam.javacore.lesson_12.solid;

public class Manager extends Person implements Coffeable {
    @Override
    public void drinkCoffee() {
        System.out.println("Manager drinks coffee as manager ...");
    }
}
