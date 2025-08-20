package com.demott.patterns.behavioral.templatemethod;

// Abstract class
abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // Template method
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}

// Concrete class
class Cricket extends Game {
    void initialize() { System.out.println("Cricket Game Initialized!"); }
    void startPlay() { System.out.println("Cricket Game Started. Enjoy the game!"); }
    void endPlay() { System.out.println("Cricket Game Finished!"); }
}

public class TemplateMethodDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
    }
}
