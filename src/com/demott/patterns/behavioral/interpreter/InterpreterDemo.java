package com.demott.patterns.behavioral.interpreter;

import java.util.Stack;

// Abstract Expression
interface Expression {
    int interpret();
}

// Terminal Expression for numbers
class NumberExpression implements Expression {
    private int number;
    public NumberExpression(int number) { this.number = number; }
    @Override
    public int interpret() { return number; }
}

// Non-terminal Expression for addition
class AddExpression implements Expression {
    private Expression left, right;
    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public int interpret() { return left.interpret() + right.interpret(); }
}

// Non-terminal Expression for subtraction
class SubtractExpression implements Expression {
    private Expression left, right;
    public SubtractExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public int interpret() { return left.interpret() - right.interpret(); }
}

public class InterpreterDemo {
    // Simple interpreter for expressions like "5 3 + 2 -" (postfix)
    public static Expression parse(String expr) {
        Stack<Expression> stack = new Stack<>();
        for (String token : expr.split(" ")) {
            if (token.equals("+")) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(new AddExpression(left, right));
            } else if (token.equals("-")) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(new SubtractExpression(left, right));
            } else {
                stack.push(new NumberExpression(Integer.parseInt(token)));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String expr = "5 3 + 2 -"; // (5 + 3) - 2 = 6
        Expression parsed = parse(expr);
        System.out.println("Result: " + parsed.interpret());
    }
}
