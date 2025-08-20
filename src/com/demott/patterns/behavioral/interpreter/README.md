# Interpreter Pattern

**Intent:** Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.

## Structure
- Abstract Expression
- Terminal Expression
- Nonterminal Expression
- Context

## Example Usage
```java
com.demott.patterns.behavioral.interpreter.Expression isHello = new com.demott.patterns.behavioral.interpreter.TerminalExpression("Hello");
System.out.println(isHello.interpret("Hello World"));
```

## When to Use
- When you have a grammar to interpret

## Related Patterns
- Composite, Iterator
