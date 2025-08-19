# Factory Pattern

**Intent:** Define an interface for creating an object, but let subclasses alter the type of objects that will be created.

## Structure
- Factory interface/class
- Concrete Factories
- Product interface/class
- Concrete Products

## Example Usage
```java
CommandFactory factory = new CommandFactory();
ICommand email = factory.createCommand(CommandType.EMAIL);
ICommand cron = factory.createCommand(CommandType.CRONJOB);
email.execute();
cron.execute();
```

## When to Use
- When a class can't anticipate the class of objects it must create
- To delegate responsibility of instantiation to subclasses

## Related Patterns
- Abstract Factory, Prototype, Builder
