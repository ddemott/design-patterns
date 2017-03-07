package com.demott.patterns.processing.command;

/**
 * @author Dale DeMott
 *
 */
public class CronJobCommand implements ICommand {

    public CronJobCommand() {
    }

    String cronJobName = "";
    String cronExpression = "";

    public CronJobCommand(String cronExpression, String cronJobName) {
        // init of cronjob
        this.cronExpression = cronExpression;
        this.cronJobName = cronJobName;
        // create cron object
        // set cron expression on object
        // execute job to execute against cron expression
    }

    @Override
    public void execute() {
        System.out.println("Executing " + cronJobName + " for:" + cronExpression);
    }
}
