package PaooGame.Entities;

import PaooGame.Game;

import java.awt.*;

public abstract class Entity {
    protected float x, y;
    protected float xMove, yMove;
    protected int width, height;
    protected Rectangle bounds;
    protected Game game;

    public Entity(Game game, float x, float y, int width, int height) {
        this.game = game;
        this.x = x;
        this.y = y;
        this.xMove = 0;
        this.yMove = 0;
        this.width = width;
        this.height = height;
        bounds = new Rectangle(0, 0, width, height);
    }

    public abstract void Update();

    public abstract void Draw(Graphics g);

    public boolean checkEntityCollisions(Entity e) {
        return e.getCollisionBounds().intersects(getCollisionBounds());
    }

    public Rectangle getCollisionBounds() {
        return new Rectangle((int) (x), (int) (y), bounds.width, bounds.height);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public boolean CollisionWithWater(int x, int y) {
        return game.getTile(x, y).GetId() == 2;
    }

    public boolean CollisionWithDirt(int x, int y) {
        return game.getTile(x, y).GetId() == 39;
    }
}
