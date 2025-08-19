





package com.demott.patterns.processing.factory;

import com.demott.patterns.processing.command.CronJobCommand;
import com.demott.patterns.processing.command.EmailCommand;
import com.demott.patterns.processing.command.ICommand;
import com.demott.patterns.processing.command.CommandType;

/**
 * Factory for creating ICommand instances based on CommandType.
 */
public class CommandFactory {

    public CommandFactory() {
    }

    /**
     * Creates a command based on the given CommandType and parameters.
     *
     * @param type       the type of command to create
     * @param parameters the parameters required for the command
     * @return ICommand instance
     * @throws IllegalArgumentException if parameters are invalid or type is unknown
     */
    public static ICommand createCommand(CommandType type, String... parameters) {
        switch (type) {
            case EMAIL:
                if (parameters.length < 4) {
                    throw new IllegalArgumentException("EMAIL command requires 4 parameters: subject, body, recipients, sender");
                }
                return new EmailCommand(parameters[0], parameters[1], parameters[2], parameters[3]);
            case CRONJOB:
                if (parameters.length < 2) {
                    throw new IllegalArgumentException("CRONJOB command requires 2 parameters: cronExpression, cronJobName");
                }
                return new CronJobCommand(parameters[0], parameters[1]);
            default:
                throw new IllegalArgumentException("Unknown command type: " + type);
        }
    }
}
