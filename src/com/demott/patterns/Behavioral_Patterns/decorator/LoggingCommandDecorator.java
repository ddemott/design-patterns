package com.demott.patterns.Behavioral_Patterns.decorator;

import com.demott.patterns.Behavioral_Patterns.command.ICommand;

public class LoggingCommandDecorator implements ICommand {
	private ICommand wrappedCommand;

	public LoggingCommandDecorator(ICommand command) {
		this.wrappedCommand = command;
	}

	@Override
	public void execute() {
		System.out.println("Logging before execution");
		wrappedCommand.execute();
		System.out.println("Logging after execution");
	}
}
