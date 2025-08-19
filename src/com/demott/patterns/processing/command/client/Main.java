package com.demott.patterns.processing.command.client;


import java.util.ArrayList;

import com.demott.patterns.processing.command.ICommand;
import com.demott.patterns.processing.command.CommandType;
import com.demott.patterns.processing.command.MacroCommand;
import com.demott.patterns.processing.command.LoggingCommandDecorator;
import com.demott.patterns.processing.factory.CommandFactory;

/**
 * @author Dale DeMott
 *
 */
public class Main {

    public static void main(String[] args) {
        // init of application and creation of Commands. This might be read into
        // the database or through configuration.


        // ---------EMAIL (with Logging Decorator)
        ICommand maintenanceEmailCommand = new LoggingCommandDecorator(
            CommandFactory.createCommand(CommandType.EMAIL, "Maintenance Notice",
                "Please note that all servers will be down from 3/20/2015 8:00 PM until 3/20/2015 12:00 AM",
                "bsmith@aCompany.com , jjackson@anotherCompany.com", "DaleDeMott@gmail.com")
        );

        // ---------CRON JOB (with Logging Decorator)
        ICommand cronJobCommand = new LoggingCommandDecorator(
            CommandFactory.createCommand(CommandType.CRONJOB, "0 15 10 ? * MON-FRI", "Backup Servers")
        );

        // MacroCommand (Composite Pattern)
        MacroCommand macro = new MacroCommand();
        macro.addCommand(maintenanceEmailCommand);
        macro.addCommand(cronJobCommand);

        ArrayList<ICommand> commands = new ArrayList<>();
        commands.add(macro);
        // END OF LOADING

        // main execution of jobs stored away in database or configuration that
        // has already been loaded into the system
        System.out.println("**************************");
        System.out.println("****START OF JOB EXECUTION");
        System.out.println("**************************");

        for (ICommand iCommand : commands) {
            iCommand.execute();
            System.out.println("-------------------");
        }
        System.out.println("**************************");
        System.out.println("****END OF JOB EXECUTION");
        System.out.println("**************************");
    }
}
