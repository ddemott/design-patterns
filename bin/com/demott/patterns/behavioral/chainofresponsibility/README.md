# Chain of Responsibility Pattern

**Intent:** Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

## Structure
- Handler interface/abstract class
- Concrete Handlers

## Example Usage
```java
// Example: Chain of Responsibility for handling commands
com.demott.patterns.behavioral.chainofresponsibility.CommandHandler emailHandler = new com.demott.patterns.behavioral.chainofresponsibility.EmailCommandHandler();
com.demott.patterns.behavioral.chainofresponsibility.CommandHandler cronHandler = new com.demott.patterns.behavioral.chainofresponsibility.CronJobCommandHandler();
emailHandler.setNext(cronHandler);

// Try handling different commands
emailHandler.handleRequest("email");    // Output: Handling email command.
emailHandler.handleRequest("cronjob");  // Output: Handling cron job command.
emailHandler.handleRequest("unknown");  // No output, not handled
```

## When to Use
- When more than one object may handle a request

## Related Patterns
- Composite, Command
