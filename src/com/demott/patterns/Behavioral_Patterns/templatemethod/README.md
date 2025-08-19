# Template Method Pattern

**Intent:** Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

## Structure
- Abstract class with template method
- Concrete subclasses

## Example Usage
```java
Game game = new Cricket();
game.play();
```

## When to Use
- When you want to let subclasses implement specific steps of an algorithm

## Related Patterns
- Strategy
