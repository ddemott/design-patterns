package com.demott.patterns.Behavioral_Patterns.observer;

public class LoggingCommandObserver implements CommandObserver {
	@Override
	public void update(String command) {
		System.out.println("Logging command: " + command);
	}
}
