package com.demott.patterns.processing.command.client;

import java.util.ArrayList;

import com.demott.patterns.processing.command.ICommand;
import com.demott.patterns.processing.factory.CommandFactory;

/**
 * @author Dale DeMott
 *
 */
public class Main {

    public static void main(String[] args) {
        // init of application and creation of Commands. This might be read into
        // the database or through configuration.

        // ---------EMAIL
        ICommand maintananceEamilCommand = CommandFactory.createCommand("EMAIL", "Maintanence Notice",
                "Please note that all servers will be down from 3/20/2015 8:00 PM until 3/20/2015 12:00 AM",
                "bsmith@aCompany.com , jjackson@anotherCompany.com", "DaleDeMott@gmail.com");

        // ---------CRON JOB
        ICommand cronJobCommand = CommandFactory.createCommand("CRONJOB", "0 15 10 ? * MON-FRI", "Backup Servers");

        ////
        // Below would be the loading of the commands into a collection for
        // processing. Notice all of the commands have the ICommand interface so
        // all have a command execute.
        ////

        ArrayList<ICommand> commands = new ArrayList<>();
        commands.add(maintananceEamilCommand);
        commands.add(cronJobCommand);
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
