greenCircle.draw();
# Bridge Pattern

**Intent:** Decouple an abstraction from its implementation so that the two can vary independently.

## Structure
- Abstraction: `Shape`
- Refined Abstraction: `Circle`
- Implementor: `DrawAPI`
- Concrete Implementors: `RedCircle`, `GreenCircle`
- Client: `BridgeDemo`

## Example Usage (from `BridgeDemo.java`)
```java
public class BridgeDemo {
	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
		redCircle.draw();   // Output: Drawing Circle[ color: red, radius: 10, x: 100, y: 100 ]
		greenCircle.draw(); // Output: Drawing Circle[ color: green, radius: 10, x: 100, y: 100 ]
	}
}
```

## When to Use
- When you want to separate abstraction from implementation

## Related Patterns
- Adapter, Composite
