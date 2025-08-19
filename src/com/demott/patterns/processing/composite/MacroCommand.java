package com.demott.patterns.processing.composite;

import com.demott.patterns.processing.command.ICommand;
import java.util.ArrayList;
import java.util.List;

/**
 * Composite command that executes a list of commands in order.
 */
public class MacroCommand implements ICommand {
    private final List<ICommand> commands = new ArrayList<>();

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
