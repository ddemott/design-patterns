# Memento Pattern

**Intent:** Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.

## Structure
- Originator: `TextEditor`
- Memento: `TextMemento`
- Caretaker: `EditorHistory`
- Client: `MementoDemo`

## Example Usage (from `MementoDemo.java`)
```java
public class MementoDemo {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		EditorHistory history = new EditorHistory();

		editor.write("Hello, world!\n");
		history.save(editor.save());

		editor.write("This is a text editor.\n");
		history.save(editor.save());

		editor.write("Adding more text.\n");
		System.out.println("Current text:\n" + editor.getText());

		// Undo last change
		editor.restore(history.undo());
		System.out.println("After undo:\n" + editor.getText());

		// Undo again
		editor.restore(history.undo());
		System.out.println("After second undo:\n" + editor.getText());
	}
}
```

## When to Use
- When you need to restore an object to a previous state

## Related Patterns
- Command
