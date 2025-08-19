package com.demott.patterns.Behavioral_Patterns.strategy;

/**
 * Strategy Pattern Example.
 * <p>
 * Intent: Define a family of algorithms, encapsulate each one, and make them interchangeable.
 * Strategy lets the algorithm vary independently from clients that use it.
 * </p>
 */
interface Strategy {
    /**
     * Performs an operation on two numbers.
     */
    int doOperation(int num1, int num2);
}
/**
 * Concrete strategy for addition.
 */
class AddStrategy implements Strategy {
    public int doOperation(int num1, int num2) { return num1 + num2; }
}
/**
 * Concrete strategy for subtraction.
 */
class SubtractStrategy implements Strategy {
    public int doOperation(int num1, int num2) { return num1 - num2; }
}
/**
 * Context uses a Strategy.
 */
class Context {
    private Strategy strategy;
    public Context(Strategy strategy) { this.strategy = strategy; }
    public int executeStrategy(int n1, int n2) { return strategy.doOperation(n1, n2); }
}
/**
 * Demo for Strategy pattern.
 */
public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new AddStrategy());
        System.out.println(context.executeStrategy(5, 3)); // 8
        context = new Context(new SubtractStrategy());
        System.out.println(context.executeStrategy(5, 3)); // 2
    }
}
