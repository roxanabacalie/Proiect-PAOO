package PaooGame;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class UIManager {

    private final Game game;
    private final ArrayList<UIObject> objects;

    public UIManager(Game game) {
        this.game = game;
        objects = new ArrayList<>();
    }

    public void Update() {
        for (UIObject o : objects)
            o.Update();
    }

    public void Draw(Graphics g) {

        for (UIObject o : objects)
            o.Draw(g);
    }

    public void onMouseMove(MouseEvent e) {
        for (UIObject o : objects)
            o.onMouseMove(e);
    }

    public void onMouseRelease(MouseEvent e) {
        for (UIObject o : objects)
            o.onMouseRelease(e);
    }

    public void addObject(UIObject o) {
        objects.add(o);
    }

}
