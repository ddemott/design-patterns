package com.demott.patterns.Behavioral_Patterns.memento;

class Memento {
    private String state;
    public Memento(String state) { this.state = state; }
    public String getState() { return state; }
}
class Originator {
    private String state;
    public void setState(String state) { this.state = state; }
    public String getState() { return state; }
    public Memento saveStateToMemento() { return new Memento(state); }
    public void getStateFromMemento(Memento m) { state = m.getState(); }
}
public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("State #1");
        Memento memento = originator.saveStateToMemento();
        originator.setState("State #2");
        originator.getStateFromMemento(memento);
        System.out.println(originator.getState()); // State #1
    }
}
