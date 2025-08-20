circle.draw();
# Flyweight Pattern

**Intent:** Use sharing to support large numbers of fine-grained objects efficiently.

## Structure
- Flyweight: `Shape` (interface)
- Concrete Flyweight: `Circle`
- Flyweight Factory: `ShapeFactory`
- Client: `FlyweightDemo`

## Example Usage (from `FlyweightDemo.java`)
```java
public class FlyweightDemo {
	public static void main(String[] args) {
		for (String color : new String[]{"Red", "Green", "Blue", "Red", "Green"}) {
			Shape circle = ShapeFactory.getCircle(color);
			circle.draw();
		}
		// Output includes:
		// Creating a Red circle
		// Drawing a Red circle
		// Creating a Green circle
		// Drawing a Green circle
		// Creating a Blue circle
		// Drawing a Blue circle
		// Drawing a Red circle
		// Drawing a Green circle
	}
}
```

## When to Use
- When many objects must be created and they share state

## Related Patterns
- Composite
