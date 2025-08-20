package com.demott.patterns.structural.facade;

// Subsystem classes
class CPU {
    public void start() { System.out.println("CPU started"); }
}
class Memory {
    public void load() { System.out.println("Memory loaded"); }
}
class Disk {
    public void spin() { System.out.println("Disk spinning"); }
}
// Facade
class Computer {
    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private Disk disk = new Disk();
    public void start() {
        cpu.start();
        memory.load();
        disk.spin();
        System.out.println("Computer started");
    }
}
public class FacadeDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
    }
}
