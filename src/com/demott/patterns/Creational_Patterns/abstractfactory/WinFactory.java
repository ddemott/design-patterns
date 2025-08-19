package com.demott.patterns.Creational_Patterns.abstractfactory;

/**
 * Concrete factory for Windows GUI components.
 */
public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }
    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
