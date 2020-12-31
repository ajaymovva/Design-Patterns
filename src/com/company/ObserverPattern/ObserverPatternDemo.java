package com.company.ObserverPattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexDecimalObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("print first occurance is: " + 10);
        subject.setState(10);
        System.out.println("print second occurance is: " + 15);
        subject.setState(15);
    }
}