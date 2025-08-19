package com.demott.patterns.Structural_Patterns.facade;

class SubsystemA {
    void operationA() { System.out.println("SubsystemA operation"); }
}
class SubsystemB {
    void operationB() { System.out.println("SubsystemB operation"); }
}
class Facade {
    private final SubsystemA a = new SubsystemA();
    private final SubsystemB b = new SubsystemB();
    void operation() {
        a.operationA();
        b.operationB();
    }
}
public class FacadeDemo {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operation();
    }
}
