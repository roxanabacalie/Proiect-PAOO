package PaooGame.Entities.Statics;

import PaooGame.Entities.Entity;
import PaooGame.Entities.Player;

import java.awt.*;
import java.util.ArrayList;

public class EntityManager {

    private final Player player;
    private final ArrayList<Entity> entities;

    public EntityManager(Player player) {
        this.player = player;
        entities = new ArrayList<>();
        addEntity(player);
    }

    public void Update() {
        for (Entity e : entities) {
            e.Update();
        }
    }

    public void Draw(Graphics g) {
        for (Entity e : entities) {
            e.Draw(g);
        }
    }

    public void addEntity(Entity e) {
        entities.add(e);
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }

}
