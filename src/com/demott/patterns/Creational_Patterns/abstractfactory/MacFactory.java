package com.demott.patterns.Creational_Patterns.abstractfactory;

/**
 * Concrete factory for Mac GUI components.
 */
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }
    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
