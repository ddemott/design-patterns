package com.demott.patterns.behavioral.state;

// State interface
interface State {
    void handle(Context context);
}

// Concrete States
class StartState implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }
    public String toString() { return "Start State"; }
}

class StopState implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }
    public String toString() { return "Stop State"; }
}

// Context
class Context {
    private State state;
    public void setState(State state) { this.state = state; }
    public State getState() { return state; }
}

public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context();
        State start = new StartState();
        State stop = new StopState();

        start.handle(context);
        System.out.println("Current State: " + context.getState());

        stop.handle(context);
        System.out.println("Current State: " + context.getState());
    }
}
