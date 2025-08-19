package com.demott.patterns.Creational_Patterns.abstractfactory;

/**
 * Windows checkbox implementation.
 */
public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows checkbox.");
    }
}
