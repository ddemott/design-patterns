
package com.demott.patterns.processing.command;

/**
 * Interface for all Commands in the Command Pattern.
 * <p>
 * Implementations should provide the logic for the execute() method.
 * </p>
 *
 * @author Dale DeMott
 */
public interface ICommand {
    /**
     * Executes the command's action.
     */
    void execute();
}
