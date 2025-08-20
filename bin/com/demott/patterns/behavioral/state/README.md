# State Pattern

**Intent:** Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

## Structure
- State: `State` (interface)
- Concrete States: `StartState`, `StopState`
- Context: `Context`
- Client: `StateDemo`

## Example Usage (from `StateDemo.java`)
```java
public class StateDemo {
	public static void main(String[] args) {
		Context context = new Context();
		State start = new StartState();
		State stop = new StopState();

		start.handle(context);
		System.out.println("Current State: " + context.getState());

		stop.handle(context);
		System.out.println("Current State: " + context.getState());
		// Output:
		// Player is in start state
		// Current State: Start State
		// Player is in stop state
		// Current State: Stop State
	}
}
```

## When to Use
- When an object's behavior depends on its state

## Related Patterns
- Strategy
