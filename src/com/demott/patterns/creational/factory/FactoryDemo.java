package com.demott.patterns.creational.factory;

// Product
interface Shape {
    void draw();
}
// Concrete Products
class Circle implements Shape {
    public void draw() { System.out.println("Drawing a Circle"); }
}
class Square implements Shape {
    public void draw() { System.out.println("Drawing a Square"); }
}
// Factory
class ShapeFactory {
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) return new Circle();
        else if (type.equalsIgnoreCase("square")) return new Square();
        throw new IllegalArgumentException("Unknown shape type");
    }
}
public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.getShape("circle");
        shape1.draw();
        Shape shape2 = factory.getShape("square");
        shape2.draw();
    }
}
