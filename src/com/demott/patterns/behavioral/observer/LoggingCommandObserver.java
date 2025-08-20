package com.demott.patterns.behavioral.observer;

public class LoggingCommandObserver implements CommandObserver {
    @Override
    public void update(String command) {
        System.out.println("Logging command: " + command);
    }
}
