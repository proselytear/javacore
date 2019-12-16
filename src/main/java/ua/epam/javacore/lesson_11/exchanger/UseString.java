package ua.epam.javacore.lesson_11.exchanger;

import java.util.concurrent.Exchanger;

public class UseString implements Runnable {
    Exchanger<String> ex;
    String str;
    UseString(Exchanger<String> c) {
        ex = c;
        new Thread(this).start();
    }
    public void run() {
        for(int i=0; i < 3; i++) {
            try {
// Exchange an empty buffer for a full one.
                str = ex.exchange(new String());
                System.out.println("Got: " + str);
            } catch(InterruptedException exc) {
                System.out.println(exc);
            }
        }
    }
}