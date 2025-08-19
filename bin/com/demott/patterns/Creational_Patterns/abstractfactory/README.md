# Abstract Factory Pattern

**Intent:** Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

## Structure
- Abstract factory interface (`GUIFactory`)
- Concrete factories (`WinFactory`, `MacFactory`)
- Abstract products (`Button`, `Checkbox`)
- Concrete products (`WinButton`, `MacButton`, etc.)

## Example Usage
```java
GUIFactory factory = new WinFactory();
Button button = factory.createButton();
button.paint();
```

## When to Use
- When your code needs to work with various families of related products
- When you want to enforce consistency among products

## Related Patterns
- Factory Method, Prototype, Singleton
