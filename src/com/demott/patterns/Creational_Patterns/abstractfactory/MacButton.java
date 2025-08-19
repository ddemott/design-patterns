package com.demott.patterns.Creational_Patterns.abstractfactory;

/**
 * Mac button implementation.
 */
public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Mac button.");
    }
}
