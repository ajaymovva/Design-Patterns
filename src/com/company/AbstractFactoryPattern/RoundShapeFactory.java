package com.company.AbstractFactoryPattern;

public class RoundShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundRectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundSquare();
        }
        return null;
    }
}
