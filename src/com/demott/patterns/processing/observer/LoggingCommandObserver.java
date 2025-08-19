package com.demott.patterns.processing.observer;

import com.demott.patterns.processing.command.ICommand;

/**
 * Example observer that logs when a command is executed.
 */
public class LoggingCommandObserver implements CommandObserver {
    @Override
    public void onCommandExecuted(ICommand command) {
        System.out.println("[Observer] Command executed: " + command.getClass().getSimpleName());
    }
}
