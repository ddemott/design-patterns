# Visitor Pattern

**Intent:** Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

## Structure
- Visitor interface: `ShoppingCartVisitor`
- Concrete Visitor: `ShoppingCartVisitorImpl`
- Element interface: `ItemElement`
- Concrete Elements: `Book`, `Fruit`
- Client: `VisitorDemo`

## Example Usage (from `VisitorDemo.java`)
```java
public class VisitorDemo {
    public static void main(String[] args) {
        List<ItemElement> items = new ArrayList<>();
        items.add(new Book(20, "1234"));
        items.add(new Book(100, "5678"));
        items.add(new Fruit(10, 2, "Banana"));
        items.add(new Fruit(5, 5, "Apple"));

        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        for (ItemElement item : items) {
            item.accept(visitor);
        }
        System.out.println("Total Cost = " + ((ShoppingCartVisitorImpl)visitor).getTotal());
        // Output includes:
        // Book ISBN: 1234 Cost = 20
        // Book ISBN: 5678 Cost = 100
        // Banana Cost = 20
        // Apple Cost = 25
        // Total Cost = 165
    }
}
```

## When to Use
- When you need to perform operations across a set of objects with different types

## Related Patterns
- Composite, Interpreter
