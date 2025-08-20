# Proxy Pattern

**Intent:** Provide a surrogate or placeholder for another object to control access to it.

## Structure
- Subject: `Image` (interface)
- Real Subject: `RealImage`
- Proxy: `ProxyImage`
- Client: `ProxyDemo`

## Example Usage (from `ProxyDemo.java`)
```java
public class ProxyDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("test_image.jpg");
		image.display(); // Output: Loading test_image.jpg\nDisplaying test_image.jpg
		image.display(); // Output: Displaying test_image.jpg
	}
}
```

## When to Use
- When you need a more versatile or sophisticated reference to an object than a simple pointer

## Related Patterns
- Decorator, Adapter
