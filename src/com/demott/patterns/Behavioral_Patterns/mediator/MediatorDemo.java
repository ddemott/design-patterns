package com.demott.patterns.Behavioral_Patterns.mediator;

class Mediator {
    private Colleague1 c1;
    private Colleague2 c2;
    public void setColleague1(Colleague1 c1) { this.c1 = c1; }
    public void setColleague2(Colleague2 c2) { this.c2 = c2; }
    public void send(String msg, Colleague sender) {
        if (sender == c1) c2.notify(msg);
        else c1.notify(msg);
    }
}
abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator m) { this.mediator = m; }
}
class Colleague1 extends Colleague {
    public Colleague1(Mediator m) { super(m); }
    public void send(String msg) { mediator.send(msg, this); }
    public void notify(String msg) { System.out.println("Colleague1 gets message: " + msg); }
}
class Colleague2 extends Colleague {
    public Colleague2(Mediator m) { super(m); }
    public void send(String msg) { mediator.send(msg, this); }
    public void notify(String msg) { System.out.println("Colleague2 gets message: " + msg); }
}
public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Colleague1 c1 = new Colleague1(mediator);
        Colleague2 c2 = new Colleague2(mediator);
        mediator.setColleague1(c1);
        mediator.setColleague2(c2);
        c1.send("Hello from C1");
        c2.send("Hello from C2");
    }
}
