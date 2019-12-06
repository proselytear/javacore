package ua.epam.javacore.lesson_08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpEmailValidation {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
    }
    public static void main(String[] args) {
        String validEmail = "proselytear@yahoo.com";
        String notValidEmail = "NOT_VALID_AND.mail.com";

        System.out.println(validEmail + " is valid: " + validate(validEmail));
        System.out.println(notValidEmail + " is valid: " + validate(notValidEmail));
    }
}
