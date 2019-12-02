package ua.epam.javacore.lesson_05;

import java.util.Comparator;

public class DeveloperByNameComparator implements Comparator<Developer> {
    @Override
    public int compare(Developer o1, Developer o2) {
      return o1.name.compareTo(o2.name);
    }
}
