package com.demott.patterns.processing.command;

public class EmailCommand implements ICommand {

    private String subject = "";
    private String body = "";
    private String recipients = "";
    private String sender = "";

    public EmailCommand() {
    }

    public EmailCommand(String subject, String body, String recipients, String sender) {
        this.subject = subject;
        this.body = body;
        this.recipients = recipients;
        this.sender = sender;
    }

    @Override
    public void execute() {
        // code that would send email
        System.out.println("Email has been sent");
        System.out.println("From:" + this.sender);
        System.out.println("To:" + recipients);
        System.out.println("Subject:" + this.subject);
        System.out.println(this.body);
    }

}
