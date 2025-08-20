package com.demott.patterns.behavioral.chainofresponsibility;

public class CronJobCommandHandler extends CommandHandler {
    @Override
    public void handleRequest(String command) {
        if (command.equalsIgnoreCase("cronjob")) {
            System.out.println("Handling cron job command.");
        } else if (next != null) {
            next.handleRequest(command);
        }
    }
}
