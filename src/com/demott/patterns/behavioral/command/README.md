# Command Pattern

**Intent:** Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

## Structure
- Command interface
- Concrete Commands
- Invoker
- Receiver

## Example Usage
```java
com.demott.patterns.behavioral.command.ICommand emailCommand = new com.demott.patterns.behavioral.command.EmailCommand();
com.demott.patterns.behavioral.command.ICommand cronJobCommand = new com.demott.patterns.behavioral.command.CronJobCommand();
emailCommand.execute();
cronJobCommand.execute();
```

## When to Use
- When you need to parameterize objects by an action to perform

## Related Patterns
- Chain of Responsibility, Composite
