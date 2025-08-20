# Factory Method Pattern

**Intent:** Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

## Structure
- Product: `Shape` (interface)
- Concrete Products: `Circle`, `Square`
- Creator (Factory): `ShapeFactory`
- Client: `FactoryDemo`

## Example Usage (from `FactoryDemo.java`)
```java
public class FactoryDemo {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape shape1 = factory.getShape("circle");
		shape1.draw(); // Output: Drawing a Circle
		Shape shape2 = factory.getShape("square");
		shape2.draw(); // Output: Drawing a Square
	}
}
```

## When to Use
- When a class can't anticipate the class of objects it must create

## Related Patterns
- Abstract Factory, Prototype
