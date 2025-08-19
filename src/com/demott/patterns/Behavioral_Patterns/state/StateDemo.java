package com.demott.patterns.Behavioral_Patterns.state;

interface State {
    void doAction(Context context);
}
class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }
}
class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }
}
class Context {
    private State state;
    public void setState(State state) { this.state = state; }
    public State getState() { return state; }
}
public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context();
        State start = new StartState();
        start.doAction(context);
        State stop = new StopState();
        stop.doAction(context);
    }
}
