package ua.epam.javacore.lesson_03;

public class Dispatch {
    public static void main(String[] args) {
        AA aa = new AA();
        AA bb = new BB();
        AA cc = new CC();

        aa.callme();
        bb.callme();
        cc.callme();
    }
}
