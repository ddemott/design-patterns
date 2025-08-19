# State Pattern

**Intent:** Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

## Structure
- Context
- State interface
- Concrete States

## Example Usage
```java
Context context = new Context();
State start = new StartState();
start.doAction(context);
State stop = new StopState();
stop.doAction(context);
```

## When to Use
- When an object's behavior depends on its state

## Related Patterns
- Strategy
