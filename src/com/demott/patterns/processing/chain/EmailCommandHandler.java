package com.demott.patterns.processing.chain;

import com.demott.patterns.processing.command.ICommand;
import com.demott.patterns.processing.command.EmailCommand;

/**
 * Example handler that only processes EmailCommand.
 */
public class EmailCommandHandler extends CommandHandler {
    @Override
    protected boolean process(ICommand command) {
        if (command instanceof EmailCommand) {
            System.out.println("[Handler] Processing EmailCommand");
            command.execute();
            return true;
        }
        return false;
    }
}
