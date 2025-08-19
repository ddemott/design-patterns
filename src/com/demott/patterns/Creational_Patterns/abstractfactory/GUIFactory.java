package com.demott.patterns.Creational_Patterns.abstractfactory;

/**
 * Abstract Factory Pattern Example.
 * <p>
 * Intent: Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
 * </p>
 */
public interface GUIFactory {
    /**
     * Creates a button.
     * @return Button
     */
    Button createButton();
    /**
     * Creates a checkbox.
     * @return Checkbox
     */
    Checkbox createCheckbox();
}
