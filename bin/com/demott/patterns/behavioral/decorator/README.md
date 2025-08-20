# Decorator Pattern

**Intent:** Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

## Structure
- Component: `Coffee` (interface)
- Concrete Component: `SimpleCoffee`
- Decorator: `CoffeeDecorator` (abstract class)
- Concrete Decorators: `MilkDecorator`, `SugarDecorator`
- Client: `DecoratorDemo`

## Example Usage (from `DecoratorDemo.java`)
```java
public class DecoratorDemo {
	public static void main(String[] args) {
		Coffee coffee = new SimpleCoffee();
		System.out.println(coffee.getDescription() + " : $" + coffee.cost()); // Output: Simple Coffee : $2.0

		coffee = new MilkDecorator(coffee);
		System.out.println(coffee.getDescription() + " : $" + coffee.cost()); // Output: Simple Coffee, Milk : $2.5

		coffee = new SugarDecorator(coffee);
		System.out.println(coffee.getDescription() + " : $" + coffee.cost()); // Output: Simple Coffee, Milk, Sugar : $2.7
	}
}
```

## When to Use
- When you need to add responsibilities to objects dynamically

## Related Patterns
- Composite, Proxy
