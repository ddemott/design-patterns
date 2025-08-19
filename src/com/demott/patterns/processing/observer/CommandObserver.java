package com.demott.patterns.processing.observer;

import com.demott.patterns.processing.command.ICommand;

/**
 * Observer interface for command execution events.
 */
public interface CommandObserver {
    void onCommandExecuted(ICommand command);
}
