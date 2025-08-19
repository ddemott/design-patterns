package com.demott.patterns.Behavioral_Patterns.chainOfResponsiblity;

public abstract class CommandHandler {
    protected CommandHandler next;

    public void setNext(CommandHandler next) {
        this.next = next;
    }

    public abstract void handleRequest(String command);
}
