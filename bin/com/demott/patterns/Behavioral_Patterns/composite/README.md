# Composite Pattern

**Intent:** Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

## Structure
- Component interface
- Leaf
- Composite

## Example Usage
```java
MacroCommand macro = new MacroCommand();
macro.addCommand(command1);
macro.addCommand(command2);
macro.execute();
```

## When to Use
- When you want to treat individual objects and compositions uniformly

## Related Patterns
- Decorator, Chain of Responsibility
