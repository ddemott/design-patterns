s1.showMessage();
# Singleton Pattern

**Intent:** Ensure a class has only one instance and provide a global point of access to it.

## Structure
- Singleton: `Singleton`
- Client: `SingletonDemo`

## Example Usage (from `SingletonDemo.java`)
```java
public class SingletonDemo {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		s1.showMessage(); // Output: Hello from Singleton!
		System.out.println("Are both instances the same? " + (s1 == s2)); // Output: true
	}
}
```

## When to Use
- When exactly one instance of a class is needed

## Related Patterns
- Factory Method
