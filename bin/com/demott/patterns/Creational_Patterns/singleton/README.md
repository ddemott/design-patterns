# Singleton Pattern

**Intent:** Ensure a class has only one instance and provide a global point of access to it.

## Structure
- Private static instance
- Private constructor
- Public static getInstance() method

## Example Usage
```java
Singleton s = Singleton.getInstance();
s.showMessage();
```

## When to Use
- When exactly one instance of a class is needed
- When global access to the instance is required

## Related Patterns
- Abstract Factory, Builder, Prototype (can use Singleton)
