package com.demott.patterns.structural.proxy;

// Subject
interface Image {
    void display();
}
// Real Subject
class RealImage implements Image {
    private String fileName;
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }
    private void loadFromDisk() {
        System.out.println("Loading " + fileName);
    }
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
// Proxy
class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;
    public ProxyImage(String fileName) { this.fileName = fileName; }
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");
        image.display(); // loading + displaying
        image.display(); // only displaying
    }
}
