package PaooGame.Entities.Statics;

import PaooGame.Game;
import PaooGame.Graphics.Assets;

import java.awt.*;

public class Tool4 extends StaticEntity {
    public Tool4(Game game, float x, float y, int height) {
        super(game, x, y, 32, 32);
    }

    @Override
    public void Update() {
    }

    @Override
    public void Draw(Graphics g) {
        g.drawImage(Assets.tool4, (int) x, (int) y, width, height, null);
    }
}

