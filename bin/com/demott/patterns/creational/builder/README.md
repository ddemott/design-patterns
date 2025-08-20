director.construct(builder);
Computer computer = builder.getResult();
System.out.println(computer);
# Builder Pattern

**Intent:** Separate the construction of a complex object from its representation so that the same construction process can create different representations.

## Structure
- Builder: `ComputerBuilder`
- Concrete Builder: `GamingComputerBuilder`
- Director: `Director`
- Product: `Computer`
- Client: `BuilderDemo`

## Example Usage (from `BuilderDemo.java`)
```java
public class BuilderDemo {
	public static void main(String[] args) {
		ComputerBuilder builder = new GamingComputerBuilder();
		Director director = new Director();
		director.construct(builder);
		Computer computer = builder.getResult();
		System.out.println(computer); // Output: Computer [CPU=Intel i9, RAM=32GB, Storage=1TB SSD]
	}
}
```

## When to Use
- When you need to construct an object step by step

## Related Patterns
- Abstract Factory, Composite
