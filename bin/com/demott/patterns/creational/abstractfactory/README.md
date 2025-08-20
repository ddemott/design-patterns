# Abstract Factory Pattern

**Intent:** Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

## Structure
- Abstract Factory: `GUIFactory`
- Concrete Factories: `WinFactory`, `MacFactory`
- Abstract Products: `Button`, `Checkbox`
- Concrete Products: `WinButton`, `WinCheckbox`, `MacButton`, `MacCheckbox`
- Client: `AbstractFactoryDemo`

## Example Usage (from `AbstractFactoryDemo.java`)
```java
public class AbstractFactoryDemo {
	public static void main(String[] args) {
		GUIFactory factory = new WinFactory();
		Button button = factory.createButton();
		Checkbox checkbox = factory.createCheckbox();
		button.paint(); // Output: Rendering a Windows button.
		checkbox.paint(); // Output: Rendering a Windows checkbox.

		factory = new MacFactory();
		button = factory.createButton();
		checkbox = factory.createCheckbox();
		button.paint(); // Output: Rendering a Mac button.
		checkbox.paint(); // Output: Rendering a Mac checkbox.
	}
}
```

## When to Use
- When your code needs to work with various families of related products

## Related Patterns
- Factory Method, Prototype
