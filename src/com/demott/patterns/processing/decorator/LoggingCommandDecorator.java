package com.demott.patterns.processing.decorator;

import com.demott.patterns.processing.command.ICommand;

/**
 * Decorator for ICommand that adds logging before and after execution.
 */
public class LoggingCommandDecorator implements ICommand {
    private final ICommand wrapped;

    public LoggingCommandDecorator(ICommand wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void execute() {
        System.out.println("[LOG] Starting command: " + wrapped.getClass().getSimpleName());
        wrapped.execute();
        System.out.println("[LOG] Finished command: " + wrapped.getClass().getSimpleName());
    }
}
