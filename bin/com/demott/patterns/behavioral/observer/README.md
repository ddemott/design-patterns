# Observer Pattern

**Intent:** Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## Structure
- Subject: `NewsAgency` (interface)
- Concrete Subject: `SimpleNewsAgency`
- Observer: `Subscriber` (interface)
- Concrete Observers: `EmailSubscriber`, `SmsSubscriber`
- Client: `ObserverDemo`

## Example Usage (from `ObserverDemo.java`)
```java
public class ObserverDemo {
	public static void main(String[] args) {
		SimpleNewsAgency agency = new SimpleNewsAgency();
		Subscriber alice = new EmailSubscriber("alice@example.com");
		Subscriber bob = new SmsSubscriber("555-1234");
		agency.addSubscriber(alice);
		agency.addSubscriber(bob);

		agency.publishNews("Breaking: Observer pattern in action!");
		agency.publishNews("Update: More news for subscribers.");
		// Output:
		// Agency publishes: Breaking: Observer pattern in action!
		// Email to alice@example.com: Breaking: Observer pattern in action!
		// SMS to 555-1234: Breaking: Observer pattern in action!
		// ...
	}
}
```

## When to Use
- When a change to one object requires changing others

## Related Patterns
- Mediator
