package ua.epam.javacore.lesson_12.patterns.creational.abstractfactory.chaining;

public class Developer {
    private Long id;
    private String firstName;
    private String lastName;
    private String specialty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Developer id(Long id) {
        this.id = id;
        return this;
    }

    public Developer firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Developer lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Developer specialty(String specialty) {
        this.specialty = specialty;
        return this;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
