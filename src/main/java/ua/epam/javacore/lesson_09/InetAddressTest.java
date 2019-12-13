package ua.epam.javacore.lesson_09;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String args[]) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        address = InetAddress.getByName("www.epam.ua");
        System.out.println(address);
        InetAddress sw[] = InetAddress.getAllByName("www.proselyte.net");
        for (int i=0; i<sw.length; i++)
            System.out.println(sw[i]);
    }
}
