# Decorator Pattern

**Intent:** Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

## Structure
- Component interface
- Concrete Component
- Decorator
- Concrete Decorators

## Example Usage
```java
ICommand decorated = new LoggingCommandDecorator(command);
decorated.execute();
```

## When to Use
- When you need to add responsibilities to objects dynamically

## Related Patterns
- Composite, Proxy
