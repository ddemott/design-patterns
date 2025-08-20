# Iterator Pattern

**Intent:** Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

## Structure
- Iterator interface
- Concrete Iterator
- Aggregate

## Example Usage
```java
java.util.Iterator<String> it = names.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

## When to Use
- When you need to traverse a collection without exposing its internals

## Related Patterns
- Composite
