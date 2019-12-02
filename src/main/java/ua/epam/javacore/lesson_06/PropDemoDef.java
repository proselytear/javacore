package ua.epam.javacore.lesson_06;

import java.util.Properties;
import java.util.Set;

public class PropDemoDef {
    public static void main(String args[]) {
        Properties defList = new Properties();
        defList.put("Florida", "Tallahassee");
        defList.put("Wisconsin", "Madison");
        Properties capitals = new Properties(defList);
        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");

        Set<?> states = capitals.keySet();

        for(Object name : states)
            System.out.println("The capital of " +
                    name + " is " +
                    capitals.getProperty((String)name)
                    + ".");
        System.out.println();

        String str = capitals.getProperty("Florida");
        System.out.println("The capital of Florida is "
                + str + ".");
    }
}
