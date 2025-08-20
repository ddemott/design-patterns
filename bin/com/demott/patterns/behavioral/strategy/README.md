# Strategy Pattern

**Intent:** Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

## Structure
- Strategy: `Strategy` (interface)
- Concrete Strategies: `AddStrategy`, `SubtractStrategy`
- Context: `Context`
- Client: `StrategyDemo`

## Example Usage (from `StrategyDemo.java`)
```java
public class StrategyDemo {
	public static void main(String[] args) {
		Context context = new Context();
		context.setStrategy(new AddStrategy());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5)); // Output: 10 + 5 = 15
		context.setStrategy(new SubtractStrategy());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5)); // Output: 10 - 5 = 5
	}
}
```

## When to Use
- When you need to use different variants of an algorithm

## Related Patterns
- State
