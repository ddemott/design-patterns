package com.demott.patterns.Behavioral_Patterns.interpreter;

interface Expression {
    boolean interpret(String context);
}
class TerminalExpression implements Expression {
    private String data;
    public TerminalExpression(String data) { this.data = data; }
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
public class InterpreterDemo {
    public static void main(String[] args) {
        Expression isHello = new TerminalExpression("Hello");
        System.out.println(isHello.interpret("Hello World")); // true
    }
}
