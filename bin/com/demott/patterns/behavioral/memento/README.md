# Memento Pattern

**Intent:** Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.

## Structure
- Originator
- Memento
- Caretaker

## Example Usage
```java
Originator originator = new Originator();
originator.setState("State #1");
Memento memento = originator.saveStateToMemento();
originator.setState("State #2");
originator.getStateFromMemento(memento);
```

## When to Use
- When you need to restore an object to a previous state

## Related Patterns
- Command
