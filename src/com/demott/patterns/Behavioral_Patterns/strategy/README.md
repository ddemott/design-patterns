# Strategy Pattern

**Intent:** Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

## Structure
- Strategy interface
- Concrete Strategies
- Context

## Example Usage
```java
Context context = new Context(new AddStrategy());
System.out.println(context.executeStrategy(5, 3));
```

## When to Use
- When you need to switch between algorithms at runtime

## Related Patterns
- State
