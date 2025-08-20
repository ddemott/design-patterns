package com.demott.patterns.behavioral.composite;

import java.util.ArrayList;
import java.util.List;

// Component
interface Employee {
    void showEmployeeDetails();
}

// Leaf
class Developer implements Employee {
    private String name;
    private String position;
    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }
    @Override
    public void showEmployeeDetails() {
        System.out.println(name + " (" + position + ")");
    }
}

// Leaf
class Manager implements Employee {
    private String name;
    private String position;
    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }
    @Override
    public void showEmployeeDetails() {
        System.out.println(name + " (" + position + ")");
    }
}

// Composite
class CompanyDirectory implements Employee {
    private List<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }
    public void removeEmployee(Employee emp) {
        employees.remove(emp);
    }
    @Override
    public void showEmployeeDetails() {
        for (Employee emp : employees) {
            emp.showEmployeeDetails();
        }
    }
}

public class CompositeDemo {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Alice", "Frontend Developer");
        Developer dev2 = new Developer("Bob", "Backend Developer");
        Manager mgr1 = new Manager("Charlie", "Project Manager");

        CompanyDirectory devDirectory = new CompanyDirectory();
        devDirectory.addEmployee(dev1);
        devDirectory.addEmployee(dev2);

        CompanyDirectory mainDirectory = new CompanyDirectory();
        mainDirectory.addEmployee(devDirectory);
        mainDirectory.addEmployee(mgr1);

        System.out.println("--- Company Employees ---");
        mainDirectory.showEmployeeDetails();
    }
}
