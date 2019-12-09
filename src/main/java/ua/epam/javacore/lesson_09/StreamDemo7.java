package ua.epam.javacore.lesson_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
// A list of names, phone numbers, and e-mail addresses.
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", "555-5555",
                "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444",
                "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333",
                "Mary@HerbSchildt.com"));
// Map just the names and phone numbers to a new stream.
        Stream<NamePhone> nameAndPhoneStream = myList.stream().map(
                (a) -> new NamePhone(a.name, a.phonenum)
        );
// Use collect to create a List of the names and phone numbers.
        List<NamePhone> npList = nameAndPhoneStream.collect(Collectors.toList());
        System.out.println("Names and phone numbers in a List:");
        for (NamePhone e : npList)
            System.out.println(e.name + ": " + e.phonenum);
// Obtain another mapping of the names and phone numbers.
        nameAndPhoneStream = myList.stream().map(
                (a) -> new NamePhone(a.name, a.phonenum)
        );
// Now, create a Set by use of collect().
        Set<NamePhone> npSet = nameAndPhoneStream.collect(Collectors.toSet());
        System.out.println("\nNames and phone numbers in a Set:");
        for (NamePhone e : npSet)
            System.out.println(e.name + ": " + e.phonenum);
    }
}
