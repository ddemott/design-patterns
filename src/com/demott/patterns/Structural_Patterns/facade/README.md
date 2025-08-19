# Facade Pattern

**Intent:** Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

## Structure
- Facade class
- Subsystem classes

## Example Usage
```java
Facade facade = new Facade();
facade.operation();
```

## When to Use
- When you want to provide a simple interface to a complex subsystem

## Related Patterns
- Mediator, Adapter
