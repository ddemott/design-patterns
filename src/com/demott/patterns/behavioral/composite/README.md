# Composite Pattern

**Intent:** Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

## Structure
- Component interface
- Leaf
- Composite

## Example Usage
```java
com.demott.patterns.behavioral.composite.MacroCommand macro = new com.demott.patterns.behavioral.composite.MacroCommand();
macro.addCommand(new com.demott.patterns.behavioral.command.EmailCommand());
macro.addCommand(new com.demott.patterns.behavioral.command.CronJobCommand());
macro.execute();
```

## When to Use
- When you want to treat individual objects and compositions uniformly

## Related Patterns
- Decorator, Chain of Responsibility
