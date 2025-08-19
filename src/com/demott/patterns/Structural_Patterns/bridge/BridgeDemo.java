package com.demott.patterns.Structural_Patterns.bridge;

// Implementor
interface DrawAPI {
    void drawCircle(int radius, int x, int y);
}

// ConcreteImplementor
class RedCircle implements DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}

// Abstraction
abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}

// RefinedAbstraction
class Circle extends Shape {
    private int x, y, radius;
    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x; this.y = y; this.radius = radius;
    }
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}

public class BridgeDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        redCircle.draw();
    }
}
