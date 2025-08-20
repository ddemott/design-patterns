package com.demott.patterns.creational.prototype;

// Prototype
interface Prototype {
    Prototype clone();
}
// Concrete Prototype
class ConcretePrototype implements Prototype {
    private String field;
    public ConcretePrototype(String field) { this.field = field; }
    public void setField(String field) { this.field = field; }
    public String getField() { return field; }
    public Prototype clone() { return new ConcretePrototype(field); }
}
public class PrototypeDemo {
    public static void main(String[] args) {
        ConcretePrototype original = new ConcretePrototype("original");
        ConcretePrototype copy = (ConcretePrototype) original.clone();
        copy.setField("copy");
        System.out.println("Original: " + original.getField());
        System.out.println("Copy: " + copy.getField());
    }
}
