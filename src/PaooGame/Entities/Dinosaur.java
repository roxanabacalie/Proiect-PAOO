package PaooGame.Entities;

import PaooGame.Game;
import PaooGame.Graphics.Animation;
import PaooGame.Graphics.Assets;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Dinosaur extends Entity {

    final private Animation animLeft;
    final private Animation animRight;
    int type;

    public Dinosaur(Game game, float x, float y, int width, int height, int type) {
        super(game, x, y, width, height);
        bounds.x = 8;
        bounds.y = 8;
        bounds.width = 16;
        bounds.height = 24;
        this.type = type;
        Assets.Init();
        animLeft = new Animation(150, Assets.dinosaurLeft);
        animRight = new Animation(150, Assets.dinosaurRight);
        xMove = 1;
    }

    @Override
    public void Update() {
        animLeft.Update();
        animRight.Update();
        switch (type) {
            case 1:
                if (x < 840 && x > 192 && xMove == 1) {
                    xMove = 1;
                } else if (x == 840 && xMove == 1) {
                    xMove = -1;
                } else if (x < 840 && x > 192 && xMove == -1) {
                    xMove = -1;
                } else if (x == 192 && xMove == -1) {
                    xMove = 1;
                }
                x += xMove;
                break;
            case 2:
                if (x < 980 && x > 450 && xMove == 1) {
                    xMove = 1;
                } else if (x == 980 && xMove == 1) {
                    xMove = -1;
                } else if (x < 980 && x > 450 && xMove == -1) {
                    xMove = -1;
                } else if (x == 450 && xMove == -1) {
                    xMove = 1;
                }
                x += xMove;
                break;
            case 3:
                if (x < 700 && x > 150 && xMove == 1) {
                    xMove = 1;
                } else if (x == 700 && xMove == 1) {
                    xMove = -1;
                } else if (x < 700 && x > 150 && xMove == -1) {
                    xMove = -1;
                } else if (x == 150 && xMove == -1) {
                    xMove = 1;
                }
                x += xMove;
                break;
            case 4:
                if (x < 800 && x > 40 && xMove == 1) {
                    xMove = 1;
                } else if (x == 800 && xMove == 1) {
                    xMove = -1;
                } else if (x < 800 && x > 40 && xMove == -1) {
                    xMove = -1;
                } else if (x == 40 && xMove == -1) {
                    xMove = 1;
                }
                x += xMove;
                break;
            case 5:
                if (x < 450 && x > 10 && xMove == 1) {
                    xMove = 1;
                } else if (x == 450 && xMove == 1) {
                    xMove = -1;
                } else if (x < 450 && x > 10 && xMove == -1) {
                    xMove = -1;
                } else if (x == 10 && xMove == -1) {
                    xMove = 1;
                }
                x += xMove;
                break;
            case 6:
                if (x < 500 && x > 50 && xMove == 1) {
                    xMove = 1;
                } else if (x == 500 && xMove == 1) {
                    xMove = -1;
                } else if (x < 500 && x > 50 && xMove == -1) {
                    xMove = -1;
                } else if (x == 50 && xMove == -1) {
                    xMove = 1;
                }
                x += xMove;
                break;
            case 7:
                if (x < 800 && x > 500 && xMove == 1) {
                    xMove = 1;
                } else if (x == 800 && xMove == 1) {
                    xMove = -1;
                } else if (x < 800 && x > 500 && xMove == -1) {
                    xMove = -1;
                } else if (x == 500 && xMove == -1) {
                    xMove = 1;
                }
                x += xMove;
                break;

            case 8:
                if (x < 550 && x > 150 && xMove == 1) {
                    xMove = 1;
                } else if (x == 550 && xMove == 1) {
                    xMove = -1;
                } else if (x < 550 && x > 150 && xMove == -1) {
                    xMove = -1;
                } else if (x == 150 && xMove == -1) {
                    xMove = 1;
                }
                x += xMove;
                break;

            case 9:
                if (x < 350 && x > 50 && xMove == 1) {
                    xMove = 1;
                } else if (x == 350 && xMove == 1) {
                    xMove = -1;
                } else if (x < 350 && x > 50 && xMove == -1) {
                    xMove = -1;
                } else if (x == 50 && xMove == -1) {
                    xMove = 1;
                }
                x += xMove;
                break;
            default:
                break;
        }
    }

    @Override
    public void Draw(Graphics g) {
        g.drawImage(getCurrentAnimationFrame(), (int) x, (int) y, null);
    }

    public BufferedImage getCurrentAnimationFrame() {
        if (xMove < 0) {
            return animLeft.getCurrentFrame();
        } else if (xMove > 0) {
            return animRight.getCurrentFrame();
        }
        return animRight.getCurrentFrame();
    }
}
