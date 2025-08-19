package com.demott.patterns.Behavioral_Patterns.chain;

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
