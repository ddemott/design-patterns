package com.demott.patterns.Structural_Patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

interface Shape {
    void draw();
}
class Circle implements Shape {
    private String color;
    public Circle(String color) { this.color = color; }
    public void draw() { System.out.println("Drawing circle of color: " + color); }
}
class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();
    public static Shape getCircle(String color) {
        return circleMap.computeIfAbsent(color, Circle::new);
    }
}
public class FlyweightDemo {
    public static void main(String[] args) {
        Shape redCircle1 = ShapeFactory.getCircle("Red");
        Shape redCircle2 = ShapeFactory.getCircle("Red");
        redCircle1.draw();
        System.out.println(redCircle1 == redCircle2); // true
    }
}
