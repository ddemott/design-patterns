# Prototype Pattern

**Intent:** Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

## Structure
- Prototype interface (`Shape` implements `Cloneable`)
- Concrete prototypes (`Circle`, `Square`)
- Prototype registry (`ShapeCache`)

## Example Usage
```java
ShapeCache.loadCache();
Shape clonedShape = ShapeCache.getShape("1");
System.out.println(clonedShape.getType());
```

## When to Use
- When creating an instance of a class is expensive or complex
- When you want to avoid subclassing the creator class

## Related Patterns
- Abstract Factory, Builder
