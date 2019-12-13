package ua.epam.javacore.lesson_10;

public class Caller implements Runnable {
    String msg;
    CallMe target;
    Thread t;
    public Caller(CallMe targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run() {
        target.call(msg);
    }
}
