c1.send("Hello from C1");
# Mediator Pattern

**Intent:** Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly.

## Structure
- Mediator interface: `ChatRoomMediator`
- Concrete Mediator: `ChatRoom`
- Colleague: `User`
- Client: `MediatorDemo`

## Example Usage (from `MediatorDemo.java`)
```java
public class MediatorDemo {
	public static void main(String[] args) {
		ChatRoomMediator chatRoom = new ChatRoom();
		User alice = new User("Alice", chatRoom);
		User bob = new User("Bob", chatRoom);
		User charlie = new User("Charlie", chatRoom);

		alice.send("Hi everyone!");
		bob.send("Hello Alice!");
		charlie.send("Hey folks, what's up?");
		// Output:
		// Alice sends: Hi everyone!
		// Bob receives: Alice: Hi everyone!
		// Charlie receives: Alice: Hi everyone!
		// ...
	}
}
```

## When to Use
- When you want to reduce coupling between communicating objects

## Related Patterns
- Observer, Facade
