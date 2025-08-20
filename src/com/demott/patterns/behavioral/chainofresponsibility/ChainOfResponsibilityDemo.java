package com.demott.patterns.behavioral.chainofresponsibility;

// Concrete handler for logging
class LoggingCommandHandler extends CommandHandler {
    @Override
    public void handleRequest(String command) {
        if (command.equalsIgnoreCase("log")) {
            System.out.println("Handling log command.");
        } else if (next != null) {
            next.handleRequest(command);
        } else {
            System.out.println("Command not handled: " + command);
        }
    }
}

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        CommandHandler emailHandler = new EmailCommandHandler();
        CommandHandler cronHandler = new CronJobCommandHandler();
        CommandHandler logHandler = new LoggingCommandHandler();

        emailHandler.setNext(cronHandler);
        cronHandler.setNext(logHandler);

        System.out.println("--- Chain of Responsibility Demo ---");
        emailHandler.handleRequest("email");    // Output: Handling email command.
        emailHandler.handleRequest("cronjob");  // Output: Handling cron job command.
        emailHandler.handleRequest("log");      // Output: Handling log command.
        emailHandler.handleRequest("unknown");  // Output: Command not handled: unknown
    }
}
