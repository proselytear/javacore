package ua.epam.javacore.lesson_09;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String args[]) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);
        Address = InetAddress.getByName("www.epam.ua");
        System.out.println(Address);
        InetAddress SW[] = InetAddress.getAllByName("www.proselyte.net");
        for (int i=0; i<SW.length; i++)
            System.out.println(SW[i]);
    }
}
