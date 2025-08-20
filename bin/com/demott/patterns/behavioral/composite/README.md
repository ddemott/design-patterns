# Composite Pattern

**Intent:** Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

## Structure
- Component interface
- Leaf
# Composite Pattern

**Intent:** Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

## Structure
- Component interface
- Leaf
- Composite

## Example Usage (from `CompositeDemo.java`)
```java
public class CompositeDemo {
	public static void main(String[] args) {
		Developer dev1 = new Developer("Alice", "Frontend Developer");
		Developer dev2 = new Developer("Bob", "Backend Developer");
		Manager mgr1 = new Manager("Charlie", "Project Manager");

		CompanyDirectory devDirectory = new CompanyDirectory();
		devDirectory.addEmployee(dev1);
		devDirectory.addEmployee(dev2);

		CompanyDirectory mainDirectory = new CompanyDirectory();
		mainDirectory.addEmployee(devDirectory);
		mainDirectory.addEmployee(mgr1);

		System.out.println("--- Company Employees ---");
		mainDirectory.showEmployeeDetails();
		// Output:
		// --- Company Employees ---
		// Alice (Frontend Developer)
		// Bob (Backend Developer)
		// Charlie (Project Manager)
	}
}
```

## When to Use
- When you want to treat individual objects and compositions uniformly

## Related Patterns
- Decorator, Chain of Responsibility
