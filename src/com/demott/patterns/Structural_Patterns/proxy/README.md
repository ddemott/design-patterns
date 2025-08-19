# Proxy Pattern

**Intent:** Provide a surrogate or placeholder for another object to control access to it.

## Structure
- Subject interface
- RealSubject
- Proxy

## Example Usage
```java
Image image = new ProxyImage("test.jpg");
image.display();
image.display();
```

## When to Use
- When you need a more versatile or sophisticated reference to an object than a simple pointer

## Related Patterns
- Decorator, Adapter
