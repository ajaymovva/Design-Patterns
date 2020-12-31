package com.company.ObserverPattern;

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Octal value is: " + Integer.toOctalString(this.subject.getState()).toString());
    }
}
