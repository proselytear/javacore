package ua.epam.javacore.lesson_03;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal tiger = new Tiger();

        animal.whoIs();
        tiger.whoIs();
    }
}
