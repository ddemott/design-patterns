package com.demott.patterns.Creational_Patterns.prototype;

import java.util.Hashtable;

/**
 * ShapeCache acts as a registry for prototype objects.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    /**
     * Returns a clone of the shape with the given id.
     */
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /**
     * Loads the cache with prototype objects.
     */
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);
    }
}
