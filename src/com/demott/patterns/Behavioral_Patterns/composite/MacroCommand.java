package com.demott.patterns.Behavioral_Patterns.composite;

import com.demott.patterns.Behavioral_Patterns.command.ICommand;
import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements ICommand {
	private List<ICommand> commands = new ArrayList<>();

	public void addCommand(ICommand command) {
		commands.add(command);
	}

	@Override
	public void execute() {
		for (ICommand command : commands) {
			command.execute();
		}
	}
}
