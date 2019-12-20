package ua.epam.javacore.lesson_12.solid;

//Open for Extension, Closed for Modification
public class Developer extends Person
        implements Codeable, Coffeable
{

    private String specialty;

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "specialty='" + specialty + '\'' +
                "} " + super.toString();
    }

    @Override
    public void writeCode() {
        System.out.println("Developer writes code ...");
    }

    @Override
    public void drinkCoffee() {
        System.out.println("Developer drinks coffee as a developer ...");
    }
}
