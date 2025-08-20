package com.demott.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

// Element interface
interface ItemElement {
    void accept(ShoppingCartVisitor visitor);
}

// Concrete Elements
class Book implements ItemElement {
    private int price;
    private String isbnNumber;
    public Book(int price, String isbnNumber) {
        this.price = price;
        this.isbnNumber = isbnNumber;
    }
    public int getPrice() { return price; }
    public String getIsbnNumber() { return isbnNumber; }
    public void accept(ShoppingCartVisitor visitor) { visitor.visit(this); }
}

class Fruit implements ItemElement {
    private int pricePerKg;
    private int weight;
    private String name;
    public Fruit(int pricePerKg, int weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }
    public int getPricePerKg() { return pricePerKg; }
    public int getWeight() { return weight; }
    public String getName() { return name; }
    public void accept(ShoppingCartVisitor visitor) { visitor.visit(this); }
}

// Visitor interface
interface ShoppingCartVisitor {
    void visit(Book book);
    void visit(Fruit fruit);
}

// Concrete Visitor
class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    private int total = 0;
    public void visit(Book book) {
        int cost = book.getPrice();
        System.out.println("Book ISBN: " + book.getIsbnNumber() + " Cost = " + cost);
        total += cost;
    }
    public void visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " Cost = " + cost);
        total += cost;
    }
    public int getTotal() { return total; }
}

public class VisitorDemo {
    public static void main(String[] args) {
        List<ItemElement> items = new ArrayList<>();
        items.add(new Book(20, "1234"));
        items.add(new Book(100, "5678"));
        items.add(new Fruit(10, 2, "Banana"));
        items.add(new Fruit(5, 5, "Apple"));

        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        for (ItemElement item : items) {
            item.accept(visitor);
        }
        System.out.println("Total Cost = " + ((ShoppingCartVisitorImpl)visitor).getTotal());
    }
}
