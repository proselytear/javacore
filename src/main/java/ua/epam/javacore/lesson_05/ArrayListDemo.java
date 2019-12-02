package ua.epam.javacore.lesson_05;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("Fourth");
        arrayList.add("Fifth");

        System.out.println("Initial size of ArrayList: " + arrayList.size());
        System.out.println("Initial arrayList content: " + arrayList);

        arrayList.remove("Third");
        arrayList.remove(1);

        System.out.println("Final size of arrayList: " + arrayList.size());
        System.out.println("Final arrayList content: " + arrayList);

        arrayList.forEach(element -> {
            System.out.println(element.toUpperCase());
        });
    }
}
