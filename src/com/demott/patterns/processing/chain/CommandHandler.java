package com.demott.patterns.processing.chain;

import com.demott.patterns.processing.command.ICommand;

/**
 * Handler in the Chain of Responsibility for processing commands.
 */
public abstract class CommandHandler {
    private CommandHandler next;

    public CommandHandler setNext(CommandHandler next) {
        this.next = next;
        return next;
    }

    public void handle(ICommand command) {
        if (!process(command) && next != null) {
            next.handle(command);
        }
    }

    /**
     * Process the command. Return true if handled, false to pass to next handler.
     */
    protected abstract boolean process(ICommand command);
}
