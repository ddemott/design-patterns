package com.demott.patterns.behavioral.chainofresponsibility;

public class EmailCommandHandler extends CommandHandler {
    @Override
    public void handleRequest(String command) {
        if (command.equalsIgnoreCase("email")) {
            System.out.println("Handling email command.");
        } else if (next != null) {
            next.handleRequest(command);
        }
    }
}
