package com.company.FactoryPattern;

public class ShapeFactory {
    // It will return the Object type based on the given input string

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }
        return null;
    }
}
