package com.company.ObserverPattern;

public class HexDecimalObserver extends Observer{
    public HexDecimalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("HexDecimal value is: " + Integer.toHexString(this.subject.getState()).toUpperCase());
    }
}
