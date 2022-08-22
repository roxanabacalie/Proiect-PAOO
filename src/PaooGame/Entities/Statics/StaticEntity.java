package PaooGame.Entities.Statics;

import PaooGame.Entities.Entity;
import PaooGame.Game;

public abstract class StaticEntity extends Entity {
    public StaticEntity(Game game, float x, float y, int width, int height) {
        super(game, x, y, width, height);
    }
}
