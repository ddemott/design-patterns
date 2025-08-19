package com.demott.patterns.processing.command;

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
