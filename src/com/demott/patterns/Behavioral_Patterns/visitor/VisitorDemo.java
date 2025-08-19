package com.demott.patterns.Behavioral_Patterns.visitor;

interface Element {
    void accept(Visitor visitor);
}
class ConcreteElementA implements Element {
    public void accept(Visitor visitor) { visitor.visit(this); }
}
interface Visitor {
    void visit(ConcreteElementA element);
}
class ConcreteVisitor implements Visitor {
    public void visit(ConcreteElementA element) {
        System.out.println("Visited ConcreteElementA");
    }
}
public class VisitorDemo {
    public static void main(String[] args) {
        Element element = new ConcreteElementA();
        Visitor visitor = new ConcreteVisitor();
        element.accept(visitor);
    }
}
