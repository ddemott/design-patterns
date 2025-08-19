package com.demott.patterns.processing.chain;

import com.demott.patterns.processing.command.ICommand;
import com.demott.patterns.processing.command.CronJobCommand;

/**
 * Example handler that only processes CronJobCommand.
 */
public class CronJobCommandHandler extends CommandHandler {
    @Override
    protected boolean process(ICommand command) {
        if (command instanceof CronJobCommand) {
            System.out.println("[Handler] Processing CronJobCommand");
            command.execute();
            return true;
        }
        return false;
    }
}
