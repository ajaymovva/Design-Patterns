package com.company.SingleTon;

public class SingleTonPatternDemo {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
        SingleSynchronized singleSynchronized = SingleSynchronized.getInstance();
        singleSynchronized.showMessage();
    }
}
