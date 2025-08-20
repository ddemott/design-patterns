# Template Method Pattern

**Intent:** Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

## Structure
- Abstract class: `Game`
- Concrete class: `Cricket`
- Client: `TemplateMethodDemo`

## Example Usage (from `TemplateMethodDemo.java`)
```java
public class TemplateMethodDemo {
	public static void main(String[] args) {
		Game game = new Cricket();
		game.play();
		// Output:
		// Cricket Game Initialized!
		// Cricket Game Started. Enjoy the game!
		// Cricket Game Finished!
	}
}
```

## When to Use
- When you want to let subclasses implement specific steps of an algorithm

## Related Patterns
- Strategy
