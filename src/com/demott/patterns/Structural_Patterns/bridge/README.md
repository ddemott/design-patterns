# Bridge Pattern

**Intent:** Decouple an abstraction from its implementation so that the two can vary independently.

## Structure
- Abstraction
- Refined Abstraction
- Implementor
- Concrete Implementor

## Example Usage
```java
Shape redCircle = new Circle(100, 100, 10, new RedCircle());
redCircle.draw();
```

## When to Use
- When you want to separate abstraction from implementation

## Related Patterns
- Adapter, Strategy
