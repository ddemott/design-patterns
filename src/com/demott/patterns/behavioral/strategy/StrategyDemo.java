package com.demott.patterns.behavioral.strategy;

// Strategy interface
interface Strategy {
    int doOperation(int a, int b);
}

// Concrete Strategies
class AddStrategy implements Strategy {
    public int doOperation(int a, int b) { return a + b; }
}
class SubtractStrategy implements Strategy {
    public int doOperation(int a, int b) { return a - b; }
}

// Context
class Context {
    private Strategy strategy;
    public void setStrategy(Strategy strategy) { this.strategy = strategy; }
    public int executeStrategy(int a, int b) { return strategy.doOperation(a, b); }
}

public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new AddStrategy());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        context.setStrategy(new SubtractStrategy());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
    }
}
