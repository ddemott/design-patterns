# Observer Pattern

**Intent:** Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## Structure
- Subject
- Observer
- Concrete Observer

## Example Usage
```java
ObservableCommand observable = new ObservableCommand();
observable.addObserver(new LoggingCommandObserver());
observable.executeCommand("test");
```

## When to Use
- When a change to one object requires changing others

## Related Patterns
- Mediator
