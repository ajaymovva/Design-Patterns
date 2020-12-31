package com.company.SingleTon;

public class SingleObject {
    private static final SingleObject singleObject = new SingleObject();
    // private constructor to prevent multiple objects creation
    private SingleObject(){
    }
    public static SingleObject getInstance(){
        return singleObject;
    }
    public void showMessage(){
        System.out.println("Singleton created");
    }
}