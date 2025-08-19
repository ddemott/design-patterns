# Adapter Pattern

**Intent:** Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

## Structure
- Target interface
- Adapter class
- Adaptee class

## Example Usage
```java
Target target = new AdapterDemo();
target.request();
```

## When to Use
- When you want to use an existing class, but its interface does not match the one you need

## Related Patterns
- Bridge, Decorator, Proxy
