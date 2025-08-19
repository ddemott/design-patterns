package com.demott.patterns.Behavioral_Patterns.templatemethod;

abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
class Cricket extends Game {
    void initialize() { System.out.println("Cricket Game Initialized!"); }
    void startPlay() { System.out.println("Cricket Game Started!"); }
    void endPlay() { System.out.println("Cricket Game Finished!"); }
}
public class TemplateMethodDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
    }
}
