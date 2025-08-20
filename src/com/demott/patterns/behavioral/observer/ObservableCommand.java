package com.demott.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableCommand {
    private List<CommandObserver> observers = new ArrayList<>();

    public void addObserver(CommandObserver observer) {
        observers.add(observer);
    }

    public void executeCommand(String command) {
        System.out.println("Executing command: " + command);
        notifyObservers(command);
    }

    private void notifyObservers(String command) {
        for (CommandObserver observer : observers) {
            observer.update(command);
        }
    }
}
