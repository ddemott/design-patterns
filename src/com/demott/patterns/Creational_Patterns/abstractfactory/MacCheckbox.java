package com.demott.patterns.Creational_Patterns.abstractfactory;

/**
 * Mac checkbox implementation.
 */
public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Mac checkbox.");
    }
}
