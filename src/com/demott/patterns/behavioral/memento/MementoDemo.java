
package com.demott.patterns.behavioral.memento;

import java.util.Stack;

// Memento
class TextMemento {
    private final String text;
    public TextMemento(String text) { this.text = text; }
    public String getText() { return text; }
}

// Originator
class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void write(String str) {
        text.append(str);
    }

    public String getText() {
        return text.toString();
    }

    public TextMemento save() {
        return new TextMemento(text.toString());
    }

    public void restore(TextMemento memento) {
        text = new StringBuilder(memento.getText());
    }
}

// Caretaker
class EditorHistory {
    private Stack<TextMemento> history = new Stack<>();

    public void save(TextMemento memento) {
        history.push(memento);
    }

    public TextMemento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return new TextMemento("");
    }
}

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
