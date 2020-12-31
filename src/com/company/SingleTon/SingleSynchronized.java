package com.company.SingleTon;

public class SingleSynchronized {
    private static SingleSynchronized singleSynchronized = null;
    private SingleSynchronized(){
    }
    public static SingleSynchronized getInstance(){
        if(singleSynchronized == null){
            synchronized (SingleSynchronized.class){
                if(singleSynchronized == null) {
                    singleSynchronized = new SingleSynchronized();
                }
            }
        }
        return singleSynchronized;
    }
    public void showMessage(){
        System.out.println("Singleton Synchronized created");
    }
}
