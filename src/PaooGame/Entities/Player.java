package PaooGame.Entities;

import PaooGame.Graphics.Assets;
import PaooGame.Game;
import PaooGame.Graphics.Animation;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends Entity {


    private final Animation animDown;
    private final Animation animUp;
    private final Animation animLeft;
    private final Animation animRight;
    private final Game game;

    public Player(Game game, float x, float y, int width, int height) {
        super(game, x, y, width, height);
        bounds.x = 8;
        bounds.y = 8;
        bounds.width = 16;
        bounds.height = 24;
        this.game = game;
        Assets.Init();
        animDown = new Animation(250, Assets.playerDown);
        animUp = new Animation(250, Assets.playerUp);
        animLeft = new Animation(250, Assets.playerLeft);
        animRight = new Animation(250, Assets.playerRight);

    }

    public void move() {
        moveX();
        moveY();
    }

    public void moveX() {
        if (xMove > 0 && x < 992) {
            int tx = (int) (x + xMove + bounds.x + bounds.width);
            if (!CollisionWithTile(tx, (int) (y + bounds.y)) && !CollisionWithTile(tx, (int) (y + bounds.y + bounds.height))) {
                x += xMove;
            }
        } else if (xMove < 0 && x > 0) {
            int tx = (int) (x + xMove + bounds.x);
            if (!CollisionWithTile(tx, (int) (y + bounds.y)) && !CollisionWithTile(tx, (int) (y + bounds.y + bounds.height))) {
                x += xMove;
            }
        }

    }

    public void moveY() {
        if (yMove < 0 && y > 0) {
            int ty = (int) (y + yMove + bounds.y);
            if (!CollisionWithTile((int) (x + bounds.x), ty) && !CollisionWithTile((int) (x + bounds.x + bounds.width), ty)) {
                y += yMove;
            }
        } else if (yMove > 0 && y < 736) {
            int ty = (int) (y + yMove + bounds.y + bounds.height);
            if (!CollisionWithTile((int) (x + bounds.x), ty) && !CollisionWithTile((int) (x + bounds.x + bounds.width), ty)) {
                y += yMove;
            }
        }
    }

    private boolean CollisionWithTile(int x, int y) {
        return game.getTile(x, y).IsSolid();
    }


    @Override
    public void Update() {
        animDown.Update();
        animUp.Update();
        animLeft.Update();
        animRight.Update();
        xMove = 0;
        yMove = 0;
        if (game.getKeyHandler().up) {
            yMove = -1;
        }
        if (game.getKeyHandler().down) {
            yMove = 1;
        }
        if (game.getKeyHandler().left) {
            xMove = -1;
        }
        if (game.getKeyHandler().right) {
            xMove = 1;
        }
        move();
    }

    @Override
    public void Draw(Graphics g) {
        g.drawImage(getCurrentAnimationFrame(), (int) x, (int) y, null);
        g.setColor(Color.red);
    }

    public BufferedImage getCurrentAnimationFrame() {
        if (xMove < 0) {
            return animLeft.getCurrentFrame();
        } else if (xMove > 0) {
            return animRight.getCurrentFrame();
        } else if (yMove < 0) {
            return animUp.getCurrentFrame();
        } else {
            return animDown.getCurrentFrame();
        }
    }
}
