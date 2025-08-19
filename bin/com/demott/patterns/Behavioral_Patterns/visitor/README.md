# Visitor Pattern

**Intent:** Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

## Structure
- Visitor interface
- Concrete Visitor
- Element interface
- Concrete Elements

## Example Usage
```java
Element element = new ConcreteElementA();
Visitor visitor = new ConcreteVisitor();
element.accept(visitor);
```

## When to Use
- When you need to perform operations across a set of objects with different types

## Related Patterns
- Composite, Iterator
