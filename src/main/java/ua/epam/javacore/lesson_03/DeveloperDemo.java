package ua.epam.javacore.lesson_03;

public class DeveloperDemo {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setId(1L);
        developer.setName("Test name");
        developer.setSpecialty("SDE III");

        System.out.println(developer);
    }
}
