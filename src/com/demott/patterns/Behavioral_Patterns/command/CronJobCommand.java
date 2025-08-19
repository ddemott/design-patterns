package com.demott.patterns.Behavioral_Patterns.command;

public class CronJobCommand implements ICommand {
	@Override
	public void execute() {
		System.out.println("Executing Cron Job Command");
	}
}
