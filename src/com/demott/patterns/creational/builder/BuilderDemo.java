package com.demott.patterns.creational.builder;

// Product
class Computer {
    private String cpu;
    private String ram;
    private String storage;
    public void setCpu(String cpu) { this.cpu = cpu; }
    public void setRam(String ram) { this.ram = ram; }
    public void setStorage(String storage) { this.storage = storage; }
    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + ", Storage=" + storage + "]";
    }
}
// Builder
interface ComputerBuilder {
    void buildCpu();
    void buildRam();
    void buildStorage();
    Computer getResult();
}
// Concrete Builder
class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();
    public void buildCpu() { computer.setCpu("Intel i9"); }
    public void buildRam() { computer.setRam("32GB"); }
    public void buildStorage() { computer.setStorage("1TB SSD"); }
    public Computer getResult() { return computer; }
}
// Director
class Director {
    public void construct(ComputerBuilder builder) {
        builder.buildCpu();
        builder.buildRam();
        builder.buildStorage();
    }
}
public class BuilderDemo {
    public static void main(String[] args) {
        ComputerBuilder builder = new GamingComputerBuilder();
        Director director = new Director();
        director.construct(builder);
        Computer computer = builder.getResult();
        System.out.println(computer);
    }
}
