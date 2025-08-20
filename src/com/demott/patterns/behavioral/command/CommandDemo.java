package com.demott.patterns.behavioral.command;

// Command interface
interface Command {
    void execute();
}

// Receiver
class Light {
    public void turnOn() {
        System.out.println("The light is ON");
    }
    public void turnOff() {
        System.out.println("The light is OFF");
    }
}

// Concrete Command to turn on the light
class TurnOnCommand implements Command {
    private Light light;
    public TurnOnCommand(Light light) { this.light = light; }
    @Override
    public void execute() { light.turnOn(); }
}

// Concrete Command to turn off the light
class TurnOffCommand implements Command {
    private Light light;
    public TurnOffCommand(Light light) { this.light = light; }
    @Override
    public void execute() { light.turnOff(); }
}

// Invoker
class RemoteControl {
    private Command command;
    public void setCommand(Command command) { this.command = command; }
    public void pressButton() { command.execute(); }
}

public class CommandDemo {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Command turnOn = new TurnOnCommand(livingRoomLight);
        Command turnOff = new TurnOffCommand(livingRoomLight);
        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOn);
        remote.pressButton(); // The light is ON

        remote.setCommand(turnOff);
        remote.pressButton(); // The light is OFF
    }
}
