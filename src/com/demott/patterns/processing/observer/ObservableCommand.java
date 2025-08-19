package com.demott.patterns.processing.observer;

import com.demott.patterns.processing.command.ICommand;
import java.util.ArrayList;
import java.util.List;

/**
 * ICommand decorator that notifies observers after execution.
 */
public class ObservableCommand implements ICommand {
    private final ICommand wrapped;
    private final List<CommandObserver> observers = new ArrayList<>();

    public ObservableCommand(ICommand wrapped) {
        this.wrapped = wrapped;
    }

    public void addObserver(CommandObserver observer) {
        observers.add(observer);
    }

    @Override
    public void execute() {
        wrapped.execute();
        for (CommandObserver observer : observers) {
            observer.onCommandExecuted(wrapped);
        }
    }
}
