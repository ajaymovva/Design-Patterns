package com.company.AbstractFactoryPattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean round){
        if(round){
            return new RoundShapeFactory();
        }
        return new ShapeFactory();
    }
}
