package com.demott.patterns.creational.abstractfactory;

// Abstract Product A
interface Button {
    void paint();
}
// Abstract Product B
interface Checkbox {
    void paint();
}
// Concrete Product A1
class WinButton implements Button {
    public void paint() { System.out.println("Rendering a Windows button."); }
}
// Concrete Product B1
class WinCheckbox implements Checkbox {
    public void paint() { System.out.println("Rendering a Windows checkbox."); }
}
// Concrete Product A2
class MacButton implements Button {
    public void paint() { System.out.println("Rendering a Mac button."); }
}
// Concrete Product B2
class MacCheckbox implements Checkbox {
    public void paint() { System.out.println("Rendering a Mac checkbox."); }
}
// Abstract Factory
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
// Concrete Factory 1
class WinFactory implements GUIFactory {
    public Button createButton() { return new WinButton(); }
    public Checkbox createCheckbox() { return new WinCheckbox(); }
}
// Concrete Factory 2
class MacFactory implements GUIFactory {
    public Button createButton() { return new MacButton(); }
    public Checkbox createCheckbox() { return new MacCheckbox(); }
}
// Client
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        GUIFactory factory = new WinFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        button.paint();
        checkbox.paint();

        factory = new MacFactory();
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        button.paint();
        checkbox.paint();
    }
}
