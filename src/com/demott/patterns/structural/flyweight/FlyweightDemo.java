package com.demott.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight
interface Shape {
    void draw();
}
// Concrete Flyweight
class Circle implements Shape {
    private String color;
    public Circle(String color) { this.color = color; }
    public void draw() { System.out.println("Drawing a " + color + " circle"); }
}
// Flyweight Factory
class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();
    public static Shape getCircle(String color) {
        Shape circle = circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating a " + color + " circle");
        }
        return circle;
    }
}
public class FlyweightDemo {
    public static void main(String[] args) {
        for (String color : new String[]{"Red", "Green", "Blue", "Red", "Green"}) {
            Shape circle = ShapeFactory.getCircle(color);
            circle.draw();
        }
    }
}
