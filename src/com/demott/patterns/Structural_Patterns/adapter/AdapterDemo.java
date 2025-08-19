package com.demott.patterns.Structural_Patterns.adapter;

/**
 * Adapter Pattern Example.
 * <p>
 * Intent: Convert the interface of a class into another interface clients expect.
 * Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 * </p>
 */
// Target interface
interface Target {
    /**
     * Request expected by the client.
     */
    void request();
}

/**
 * Adaptee class with an incompatible interface.
 */
class Adaptee {
    void specificRequest() {
        System.out.println("Called specificRequest()");
    }
}

/**
 * Adapter makes Adaptee's interface compatible with Target.
 */
public class AdapterDemo implements Target {
    private final Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.specificRequest();
    }
    public static void main(String[] args) {
        Target target = new AdapterDemo();
        target.request();
    }
}
