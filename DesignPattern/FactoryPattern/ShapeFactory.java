package DesignPattern.FactoryPattern;

public class ShapeFactory {
    Shape getShape(String inpuString) {
        switch (inpuString) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return new Square();
        }
    }
}
