package ua.epam.javacore.lesson_11.exchanger;

import java.util.concurrent.Exchanger;

public class ExgrDemo {
    public static void main(String args[]) {
        Exchanger<String> exgr = new Exchanger<>();
        new UseString(exgr);
        new MakeString(exgr);
    }
}
