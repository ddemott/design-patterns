package com.demott.patterns.processing.factory;

import com.demott.patterns.processing.command.CronJobCommand;
import com.demott.patterns.processing.command.EmailCommand;
import com.demott.patterns.processing.command.ICommand;

public class CommandFactory {

    public CommandFactory() {
    }

    public static ICommand createCommand(String commandName, String... parameters) {
        if (commandName.toUpperCase().equals("EMAIL")) {
            return new EmailCommand(parameters[0], parameters[1], parameters[2], parameters[3]);
        }
        if (commandName.toUpperCase().equals("CRONJOB")) {
            return new CronJobCommand(parameters[0], parameters[1]);
        }
        return null;
    }

}
