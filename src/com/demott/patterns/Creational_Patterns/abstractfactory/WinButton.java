package com.demott.patterns.Creational_Patterns.abstractfactory;

/**
 * Windows button implementation.
 */
public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows button.");
    }
}
