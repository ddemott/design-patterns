package com.demott.patterns.Creational_Patterns.prototype;

/**
 * Concrete prototype: Square.
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }
    @Override
    public void setId(String id) {
        super.setId(id);
    }
}
