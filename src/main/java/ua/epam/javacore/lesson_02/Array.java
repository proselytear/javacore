package ua.epam.javacore.lesson_02;

public class Array {
    public static void main(String args[]) {
        int monthDays[];
        monthDays = new int[12];
        monthDays[0] = 31;
        monthDays[1] = 28;
        monthDays[2] = 31;
        monthDays[3] = 30;
        monthDays[4] = 31;
        monthDays[5] = 30;
        monthDays[6] = 31;
        monthDays[7] = 31;
        monthDays[8] = 30;
        monthDays[9] = 31;
        monthDays[10] = 30;
        monthDays[11] = 31;
        System.out.println("April has " + monthDays[11] + " days.");
    }
}
