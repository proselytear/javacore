package ua.epam.javacore.lesson_05;

import java.util.Objects;

public class Developer implements Comparable<Developer>{
    Long id;
    String name;
    String country;

    public Developer(Long id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(id, developer.id) &&
                Objects.equals(name, developer.name) &&
                Objects.equals(country, developer.country);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, country);
    }

    @Override
    public int compareTo(Developer o) {
        if(id < o.id){
            return -1;
        }

        if(id > o.id){
            return 1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
