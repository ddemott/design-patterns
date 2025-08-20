# Prototype Pattern

**Intent:** Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

## Structure
- Prototype: `Prototype` (interface)
- Concrete Prototype: `ConcretePrototype`
- Client: `PrototypeDemo`

## Example Usage (from `PrototypeDemo.java`)
```java
public class PrototypeDemo {
	public static void main(String[] args) {
		ConcretePrototype original = new ConcretePrototype("original");
		ConcretePrototype copy = (ConcretePrototype) original.clone();
		copy.setField("copy");
		System.out.println("Original: " + original.getField()); // Output: Original: original
		System.out.println("Copy: " + copy.getField()); // Output: Copy: copy
	}
}
```

## When to Use
- When the classes to instantiate are specified at run-time

## Related Patterns
- Factory Method, Abstract Factory
