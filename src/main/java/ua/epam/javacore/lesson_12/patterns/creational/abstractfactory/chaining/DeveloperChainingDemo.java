package ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.chaining;

public class DeveloperChainingDemo {
    public static void main(String[] args) {
        Developer developer = new Developer()
                .id(1L)
                .firstName("Ivan")
                .lastName("Ivanov")
                .specialty("Software Engineer");

        System.out.println(developer);
    }
}
