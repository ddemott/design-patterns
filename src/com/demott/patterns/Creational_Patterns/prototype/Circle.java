package com.demott.patterns.Creational_Patterns.prototype;

/**
 * Concrete prototype: Circle.
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }
    @Override
    public void setId(String id) {
        super.setId(id);
    }
}
