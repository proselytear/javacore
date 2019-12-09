package ua.epam.javacore.lesson_09;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
// A list of names, phone numbers, and e-mail addresses.
        ArrayList<NamePhoneEmail> namePhoneEmails = new ArrayList<>();

        namePhoneEmails.add(new NamePhoneEmail("Larry", "555-5555",
                "Larry@HerbSchildt.com"));
        namePhoneEmails.add(new NamePhoneEmail("James", "555-4444",
                "James@HerbSchildt.com"));
        namePhoneEmails.add(new NamePhoneEmail("Mary", "555-3333",
                "Mary@HerbSchildt.com"));
        System.out.println("Original values in myList: ");
        namePhoneEmails.stream().forEach((a) -> {
            System.out.println(a.name + " " + a.phonenum + " " + a.email);
        });
        System.out.println();
// Map just the names and phone numbers to a new stream.
        Stream<NamePhone> nameAndPhone = namePhoneEmails.stream().map(
                (a) -> new NamePhone(a.name, a.phonenum)
        );
        System.out.println("List of names and phone numbers: ");
        nameAndPhone.forEach((a) -> {
            System.out.println(a.name + " " + a.phonenum);
        });
    }
}
