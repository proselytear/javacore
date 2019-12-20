package ua.epam.javacore.lesson_12.solid;

public class Demo {
    public static void main(String[] args) {
        // Dependency Inversion
        Coffeable developer = new Developer();
        Coffeable manager = new Manager();

        developer.drinkCoffee();
        manager.drinkCoffee();
    }
}
