# Builder Pattern

**Intent:** Separate the construction of a complex object from its representation so that the same construction process can create different representations.

## Structure
- Builder class (`Person.Builder`)
- Product class (`Person`)

## Example Usage
```java
Person p = new Person.Builder()
    .setFirstName("John")
    .setLastName("Doe")
    .setAge(30)
    .build();
System.out.println(p);
```

## When to Use
- When you need to construct an object with many possible configuration options
- When you want to avoid telescoping constructors

## Related Patterns
- Abstract Factory, Prototype
