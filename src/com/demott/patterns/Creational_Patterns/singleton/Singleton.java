package com.demott.patterns.Creational_Patterns.singleton;

/**
 * Singleton Pattern Example.
 * <p>
 * Intent: Ensure a class has only one instance and provide a global point of access to it.
 * </p>
 * Usage: Singleton s = Singleton.getInstance();
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    /**
     * Returns the single instance of Singleton.
     * @return Singleton instance
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Example method to show usage.
     */
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
