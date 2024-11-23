package DesignPattern.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Shape sh = new ShapeFactory().getShape("CIRCLE");
        sh.draw();
    }
}
