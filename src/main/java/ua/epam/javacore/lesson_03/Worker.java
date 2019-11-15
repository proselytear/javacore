package ua.epam.javacore.lesson_03;


public class Worker extends Person {

    private String specialty;


    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public void doJob() {
        System.out.println("Working ...");
    }
}
