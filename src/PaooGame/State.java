package PaooGame;

import java.awt.Graphics;

public abstract class State {

    private static State currentState = null;

    public static void setState(State state) {
        currentState = state;
    }

    public static State getState() {
        return currentState;
    }


    protected Game game;

    public State(Game game) {
        this.game = game;
    }

    public abstract void Update();

    public abstract void Draw(Graphics g);

    public abstract void registerObserver(Observer score);

    public abstract int getLevel();
}
