package com.company.ObserverPattern;

public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Binary observer value is: " + Integer.toBinaryString(this.subject.getState()).toString());
    }
}
