package PaooGame.Entities.Statics;

import PaooGame.Game;
import PaooGame.Graphics.Assets;

import java.awt.*;

public class Knife extends StaticEntity {
    public Knife(Game game, float x, float y) {
        super(game, x, y, 32, 32);
    }

    @Override
    public void Update() {
    }

    @Override
    public void Draw(Graphics g) {
        g.drawImage(Assets.knife, (int) x, (int) y, width, height, null);
    }
}

