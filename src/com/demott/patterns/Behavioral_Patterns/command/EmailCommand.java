package com.demott.patterns.Behavioral_Patterns.command;

public class EmailCommand implements ICommand {
	@Override
	public void execute() {
		System.out.println("Executing Email Command");
	}
}
