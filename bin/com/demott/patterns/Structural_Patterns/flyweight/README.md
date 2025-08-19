# Flyweight Pattern

**Intent:** Use sharing to support large numbers of fine-grained objects efficiently.

## Structure
- Flyweight interface
- Concrete Flyweight
- Flyweight Factory

## Example Usage
```java
Shape redCircle1 = ShapeFactory.getCircle("Red");
Shape redCircle2 = ShapeFactory.getCircle("Red");
redCircle1.draw();
System.out.println(redCircle1 == redCircle2); // true
```

## When to Use
- When many objects must be created and they share state

## Related Patterns
- Composite
