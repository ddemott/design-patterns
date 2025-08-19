
# Command Factory Pattern for Processing


This project demonstrates how to combine the **Factory**, **Command**, **Composite**, **Decorator**, **Chain of Responsibility**, and **Observer** patterns in Java to create a flexible and extensible command processing system.



## Patterns Used

- **Command Pattern:** Encapsulates actions as objects via the `ICommand` interface and concrete commands like `EmailCommand` and `CronJobCommand`.
- **Factory Pattern:** `CommandFactory` creates command objects based on a `CommandType` enum, with parameter validation and error handling.
- **Composite Pattern:** `MacroCommand` allows grouping multiple commands to be executed as a single command.
- **Decorator Pattern:** `LoggingCommandDecorator` adds logging functionality to any command.
- **Chain of Responsibility Pattern:** `CommandHandler` and its subclasses allow commands to be processed by a chain of handlers, each responsible for a specific command type.
- **Observer Pattern:** `ObservableCommand` and `CommandObserver` allow observers to be notified when a command is executed.



## Key Classes

- `ICommand`: Interface for all commands.
- `EmailCommand`, `CronJobCommand`: Concrete command implementations.
- `CommandFactory`: Creates commands using the `CommandType` enum.
- `MacroCommand`: Composite command for batch execution.
- `LoggingCommandDecorator`: Decorator for logging command execution.
- `CommandHandler`: Abstract handler for the chain of responsibility.
- `EmailCommandHandler`, `CronJobCommandHandler`: Concrete handlers for specific command types.
- `ObservableCommand`: Decorator that notifies observers after command execution.
- `CommandObserver`, `LoggingCommandObserver`: Observer interface and example implementation.



## Example Usage

### Command Creation, Composite, and Decorator
```java
import com.demott.patterns.processing.command.ICommand;
import com.demott.patterns.processing.command.CommandType;
import com.demott.patterns.processing.factory.CommandFactory;
import com.demott.patterns.processing.composite.MacroCommand;
import com.demott.patterns.processing.decorator.LoggingCommandDecorator;

ICommand emailCommand = new LoggingCommandDecorator(
	CommandFactory.createCommand(CommandType.EMAIL, "Subject", "Body", "to@example.com", "from@example.com")
);
ICommand cronJobCommand = new LoggingCommandDecorator(
	CommandFactory.createCommand(CommandType.CRONJOB, "0 15 10 ? * MON-FRI", "Backup Servers")
);

MacroCommand macro = new MacroCommand();
macro.addCommand(emailCommand);
macro.addCommand(cronJobCommand);

macro.execute();
```

### Chain of Responsibility
```java
import com.demott.patterns.processing.chain.CommandHandler;
import com.demott.patterns.processing.chain.EmailCommandHandler;
import com.demott.patterns.processing.chain.CronJobCommandHandler;

// Set up handlers
CommandHandler emailHandler = new EmailCommandHandler();
CommandHandler cronHandler = new CronJobCommandHandler();
emailHandler.setNext(cronHandler);

// Pass commands through the chain
emailHandler.handle(emailCommand);      // Handled by EmailCommandHandler
emailHandler.handle(cronJobCommand);    // Passed to CronJobCommandHandler
```

### Observer Pattern
```java
import com.demott.patterns.processing.observer.ObservableCommand;
import com.demott.patterns.processing.observer.LoggingCommandObserver;

ObservableCommand observableEmail = new ObservableCommand(emailCommand);
observableEmail.addObserver(new LoggingCommandObserver());

observableEmail.execute(); // Observer will be notified after execution
```

## How to Extend

- Add new command types by implementing `ICommand` and updating `CommandFactory` and `CommandType`.
- Add new decorators for cross-cutting concerns (e.g., security, retry).
- Use `MacroCommand` to group and execute commands in batches.

## Error Handling

`CommandFactory` validates parameters and throws `IllegalArgumentException` for invalid or unknown commands.

## Author

Dale DeMott
