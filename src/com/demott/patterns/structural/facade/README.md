# Facade Pattern

**Intent:** Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

## Structure
- Subsystem classes: `CPU`, `Memory`, `Disk`
- Facade: `Computer`
- Client: `FacadeDemo`

## Example Usage (from `FacadeDemo.java`)
```java
public class FacadeDemo {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.start();
		// Output:
		// CPU started
		// Memory loaded
		// Disk spinning
		// Computer started
	}
}
```

## When to Use
- When you want to provide a simple interface to a complex subsystem

## Related Patterns
- Mediator, Singleton
