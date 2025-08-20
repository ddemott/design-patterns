# Mediator Pattern

**Intent:** Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly.

## Structure
- Mediator interface/class
- Concrete Mediator
- Colleague classes

## Example Usage
```java
Mediator mediator = new Mediator();
Colleague1 c1 = new Colleague1(mediator);
Colleague2 c2 = new Colleague2(mediator);
mediator.setColleague1(c1);
mediator.setColleague2(c2);
c1.send("Hello from C1");
```

## When to Use
- When you want to reduce coupling between communicating objects

## Related Patterns
- Observer, Facade
