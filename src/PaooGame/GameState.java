package PaooGame;

import PaooGame.Entities.Dinosaur;
import PaooGame.Entities.Player;
import PaooGame.Entities.Statics.*;
import PaooGame.Tiles.Tile;

import java.awt.*;
import java.util.ArrayList;

import static PaooGame.Tiles.Tile.map;

public class GameState extends State implements Subject {

    private int level;
    private long score;
    long start;
    long end;

    public EntityManager entityManager;
    private final ArrayList<Observer> observers = new ArrayList<>();
    private final int[] nrTools = {3, 6, 10};
    private final int[] nrDinos = {2, 5, 9};

    public GameState(Game game) {
        super(game);

        level = 1;
        score = 0;
        start = System.currentTimeMillis();
        entityManager = new EntityManager(new Player(game, 500, 200, 32, 32));
        CreateEntities();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            System.out.println("Notifying Observer");
            ob.update(this.level, this.score);
        }
    }

    public void CreateEntities() {
        if (entityManager.getEntities().isEmpty())
            entityManager.addEntity(new Player(game, 500, 200, 32, 32));
        if (level == 1) {
            entityManager.addEntity(new Rope(game, 192, 0));
            entityManager.addEntity(new Tool1(game, 320, 192));
            entityManager.addEntity(new Tool2(game, 700, 250));
            entityManager.addEntity(new Tool3(game, 250, 500));
            entityManager.addEntity(new Tool4(game, 500, 300, 32));
            entityManager.addEntity(new Tool5(game, 300, 550));
            entityManager.addEntity(new Knife(game, 600, 600));
            entityManager.addEntity(new Rope(game, 700, 700));
            entityManager.addEntity(new Rope(game, 350, 450));
            entityManager.addEntity(new Tool5(game, 800, 500));
            entityManager.addEntity(new Tool4(game, 900, 0, 32));
            entityManager.addEntity(new Tool1(game, 600, 15));
            entityManager.addEntity(new Tool2(game, 500, 100));
            entityManager.addEntity(new Tool5(game, 20, 500));
            entityManager.addEntity(new Rope(game, 250, 700));
            entityManager.addEntity(new Dinosaur(game, 192, 280, 50, 64, 1));
            entityManager.addEntity(new Dinosaur(game, 450, 32, 50, 64, 2));
        }
        if (level == 2) {

            entityManager.addEntity(new Rope(game, 192, 0));
            entityManager.addEntity(new Tool1(game, 320, 192));
            entityManager.addEntity(new Tool2(game, 700, 250));
            entityManager.addEntity(new Tool3(game, 250, 500));
            entityManager.addEntity(new Tool4(game, 500, 300, 32));
            entityManager.addEntity(new Tool5(game, 300, 550));
            entityManager.addEntity(new Knife(game, 600, 600));
            entityManager.addEntity(new Rope(game, 770, 250));
            entityManager.addEntity(new Rope(game, 350, 450));
            entityManager.addEntity(new Tool5(game, 650, 500));
            entityManager.addEntity(new Tool4(game, 900, 400, 32));
            entityManager.addEntity(new Tool1(game, 900, 200));
            entityManager.addEntity(new Tool2(game, 500, 100));
            entityManager.addEntity(new Tool5(game, 600, 200));
            entityManager.addEntity(new Rope(game, 250, 460));
            entityManager.addEntity(new Rope(game, 100, 600));
            entityManager.addEntity(new Rope(game, 150, 450));
            entityManager.addEntity(new Tool5(game, 100, 500));
            entityManager.addEntity(new Tool4(game, 100, 200, 32));
            entityManager.addEntity(new Tool1(game, 100, 450));

            entityManager.addEntity(new Dinosaur(game, 192, 280, 50, 64, 1));
            entityManager.addEntity(new Dinosaur(game, 150, 200, 50, 64, 8));
            entityManager.addEntity(new Dinosaur(game, 250, 250, 50, 64, 6));
            entityManager.addEntity(new Dinosaur(game, 450, 350, 50, 64, 7));
            entityManager.addEntity(new Dinosaur(game, 50, 500, 50, 64, 9));

        }

        if (level == 3) {

            entityManager.addEntity(new Rope(game, 192, 0));
            entityManager.addEntity(new Tool1(game, 400, 120));
            entityManager.addEntity(new Tool2(game, 50, 500));
            entityManager.addEntity(new Tool3(game, 100, 0));
            entityManager.addEntity(new Tool4(game, 350, 0, 32));
            entityManager.addEntity(new Tool5(game, 700, 30));
            entityManager.addEntity(new Knife(game, 750, 100));
            entityManager.addEntity(new Rope(game, 300, 200));
            entityManager.addEntity(new Rope(game, 500, 250));
            entityManager.addEntity(new Tool5(game, 300, 300));
            entityManager.addEntity(new Tool4(game, 800, 400, 32));
            entityManager.addEntity(new Tool1(game, 900, 500));
            entityManager.addEntity(new Tool2(game, 200, 650));
            entityManager.addEntity(new Tool5(game, 800, 550));
            entityManager.addEntity(new Rope(game, 250, 460));
            entityManager.addEntity(new Rope(game, 100, 600));
            entityManager.addEntity(new Rope(game, 150, 450));
            entityManager.addEntity(new Tool5(game, 330, 500));
            entityManager.addEntity(new Tool4(game, 100, 120, 32));
            entityManager.addEntity(new Tool1(game, 100, 450));


            entityManager.addEntity(new Tool2(game, 500, 500));
            entityManager.addEntity(new Tool3(game, 700, 500));
            entityManager.addEntity(new Tool4(game, 980, 10, 32));
            entityManager.addEntity(new Tool5(game, 20, 700));
            entityManager.addEntity(new Knife(game, 20, 200));
            entityManager.addEntity(new Rope(game, 300, 650));
            entityManager.addEntity(new Rope(game, 200, 100));
            entityManager.addEntity(new Tool5(game, 300, 50));
            entityManager.addEntity(new Tool4(game, 150, 350, 32));
            entityManager.addEntity(new Tool1(game, 980, 180));


            entityManager.addEntity(new Dinosaur(game, 0, 0, 50, 64, 3));
            entityManager.addEntity(new Dinosaur(game, 150, 200, 50, 64, 8));
            entityManager.addEntity(new Dinosaur(game, 250, 250, 50, 64, 6));
            entityManager.addEntity(new Dinosaur(game, 450, 350, 50, 64, 7));
            entityManager.addEntity(new Dinosaur(game, 600, 425, 50, 64, 7));
            entityManager.addEntity(new Dinosaur(game, 40, 450, 50, 64, 4));
            entityManager.addEntity(new Dinosaur(game, 50, 500, 50, 64, 9));
            entityManager.addEntity(new Dinosaur(game, 500, 500, 50, 64, 7));
            entityManager.addEntity(new Dinosaur(game, 0, 620, 50, 64, 5));

        }
    }

    @Override
    public void Update() {


        if (entityManager.getEntities().isEmpty())
            CreateEntities();
        entityManager.Update();
        for (int i = 1; i < entityManager.getEntities().size() - nrDinos[level - 1]; ++i) {
            if (game.getKeyHandler().space && entityManager.getEntities().get(0).checkEntityCollisions(entityManager.getEntities().get(i)))
                entityManager.getEntities().remove(i);
        }
        int i = entityManager.getEntities().size() - 1;
        if (entityManager.getEntities().get(0).checkEntityCollisions(entityManager.getEntities().get(i))) {
            System.out.println("Ai pierdut, ai fost gasit de dinozaur!");
            level = 1;
            State.setState(game.getMenuState());
            if (!entityManager.getEntities().isEmpty())
                entityManager.getEntities().clear();

        }
        i = i - 1;
        if (!entityManager.getEntities().isEmpty()) {
            if (entityManager.getEntities().get(0).checkEntityCollisions(entityManager.getEntities().get(i))) {
                System.out.println("Ai pierdut, ai fost gasit de dinozaur!");
                level = 1;
                State.setState(game.getMenuState());
                if (!entityManager.getEntities().isEmpty())
                    entityManager.getEntities().clear();

            }
        }
        if (level == 2 || level == 3) {
            i = i - 1;
            if (!entityManager.getEntities().isEmpty()) {
                if (entityManager.getEntities().get(0).checkEntityCollisions(entityManager.getEntities().get(i))) {
                    System.out.println("Ai pierdut, ai fost gasit de dinozaur!");
                    level = 1;
                    State.setState(game.getMenuState());
                    if (!entityManager.getEntities().isEmpty())
                        entityManager.getEntities().clear();

                }
            }
            i = i - 1;
            if (!entityManager.getEntities().isEmpty()) {
                if (entityManager.getEntities().get(0).checkEntityCollisions(entityManager.getEntities().get(i))) {
                    System.out.println("Ai pierdut, ai fost gasit de dinozaur!");
                    level = 1;
                    State.setState(game.getMenuState());
                    if (!entityManager.getEntities().isEmpty())
                        entityManager.getEntities().clear();

                }
            }
            i = i - 1;
            if (!entityManager.getEntities().isEmpty()) {
                if (entityManager.getEntities().get(0).checkEntityCollisions(entityManager.getEntities().get(i))) {
                    System.out.println("Ai pierdut, ai fost gasit de dinozaur!");
                    level = 1;
                    State.setState(game.getMenuState());
                    if (!entityManager.getEntities().isEmpty())
                        entityManager.getEntities().clear();

                }
            }
        }
        if (level == 3) {
            i = i - 1;
            if (!entityManager.getEntities().isEmpty()) {
                if (entityManager.getEntities().get(0).checkEntityCollisions(entityManager.getEntities().get(i))) {
                    System.out.println("Ai pierdut, ai fost gasit de dinozaur!");
                    level = 1;
                    State.setState(game.getMenuState());
                    if (!entityManager.getEntities().isEmpty())
                        entityManager.getEntities().clear();

                }
            }
            i = i - 1;
            if (!entityManager.getEntities().isEmpty()) {
                if (entityManager.getEntities().get(0).checkEntityCollisions(entityManager.getEntities().get(i))) {
                    System.out.println("Ai pierdut, ai fost gasit de dinozaur!");
                    level = 1;
                    State.setState(game.getMenuState());
                    if (!entityManager.getEntities().isEmpty())
                        entityManager.getEntities().clear();

                }
            }
            i = i - 1;
            if (!entityManager.getEntities().isEmpty()) {
                if (entityManager.getEntities().get(0).checkEntityCollisions(entityManager.getEntities().get(i))) {
                    System.out.println("Ai pierdut, ai fost gasit de dinozaur!");
                    level = 1;
                    State.setState(game.getMenuState());
                    if (!entityManager.getEntities().isEmpty())
                        entityManager.getEntities().clear();

                }
            }
            i = i - 1;
            if (!entityManager.getEntities().isEmpty()) {
                if (entityManager.getEntities().get(0).checkEntityCollisions(entityManager.getEntities().get(i))) {
                    System.out.println("Ai pierdut, ai fost gasit de dinozaur!");
                    level = 1;
                    State.setState(game.getMenuState());
                    if (!entityManager.getEntities().isEmpty())
                        entityManager.getEntities().clear();

                }
            }
        }

        if (!entityManager.getEntities().isEmpty()) {
            if (entityManager.getEntities().get(0).CollisionWithWater((int) entityManager.getEntities().get(0).getX(), (int) entityManager.getEntities().get(0).getY())) {
                System.out.println("Ai pierdut, ai cazut in apa!");
                level = 1;
                State.setState(game.getMenuState());
                if (!entityManager.getEntities().isEmpty())
                    entityManager.getEntities().clear();
            }
        }
        if (!entityManager.getEntities().isEmpty()) {
            if (entityManager.getEntities().get(0).CollisionWithDirt((int) entityManager.getEntities().get(0).getX(), (int) entityManager.getEntities().get(0).getY())) {
                System.out.println("Ai pierdut, ai cazut in groapa!");
                level = 1;
                State.setState(game.getMenuState());
                if (!entityManager.getEntities().isEmpty())
                    entityManager.getEntities().clear();
            }
        }
        if (!entityManager.getEntities().isEmpty()) {
            if (entityManager.getEntities().size() == nrTools[level - 1]) {
                end = System.currentTimeMillis();
                score = end - start;
                notifyObservers();
                System.out.println("Ai castigat nivelul!");
                if (level == 3) {
                    State.setState(game.getMenuState());
                    level = 1;
                }
                if (level == 2)
                    level = 3;
                if (level == 1)
                    level = 2;
                if (!entityManager.getEntities().isEmpty())
                    entityManager.getEntities().clear();

            }
        }
    }

    @Override
    public void Draw(Graphics g) {
        for (int row = 0; row < 24; ++row) {
            for (int col = 0; col < 32; ++col) {
                switch (map.getMap(level)[row][col]) {
                    case 0:
                        Tile.grassTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 1:
                        Tile.waterTopRightTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 2:
                        Tile.waterTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 3:
                        Tile.waterBottomLeft2Tile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 4:
                        Tile.waterLeftTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 5:
                        Tile.roundTreeLeftTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 6:
                        Tile.roundTreeCenterTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 7:
                        Tile.roundTreeRightTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 8:
                        Tile.roundTreeTopLeftTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 9:
                        Tile.roundTreeTopTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 10:
                        Tile.roundTreeBottomLeftTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 11:
                        Tile.roundTreeBottomTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 12:
                        Tile.roundTreeBottomRightTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 13:
                        Tile.waterRightTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 14:
                        Tile.waterBottomTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 15:
                        Tile.waterBottomLeftTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 16:
                        Tile.grass2Tile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 17:
                        Tile.waterBottomRight2Tile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 18:
                        Tile.flowersTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 19:
                        Tile.waterTopLeftTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 20:
                        Tile.waterBottomRightTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 21:
                        Tile.waterTopRight2Tile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 22:
                        Tile.waterTopLeft2Tile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 23:
                        Tile.waterTopTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 24:
                        Tile.waterRocksLeftTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 25:
                        Tile.waterRocksTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 26:
                        Tile.waterRocksRightTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 27:
                        Tile.woodTopLeftTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 28:
                        Tile.woodTopRightTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 29:
                        Tile.woodLeftTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 30:
                        Tile.woodRightTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 31:
                        Tile.woodBottomLeftTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 32:
                        Tile.woodBottomRightTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 33:
                        Tile.dirtTopTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 34:
                        Tile.dirtBottomTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 35:
                        Tile.dirtTopRightTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 36:
                        Tile.dirtTopLeftTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 37:
                        Tile.dirtRightTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 38:
                        Tile.dirtLeftTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 39:
                        Tile.dirtCenterTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 40:
                        Tile.dirtBottomLeftTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 41:
                        Tile.dirtTopRight2.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 42:
                        Tile.dirtBottomRightSpiderTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 43:
                        Tile.dirtRightSpiderTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 44:
                        Tile.dirtCenterSpiderTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 45:
                        Tile.dirtLeftSpiderTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 46:
                        Tile.dirtTopSpiderTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 47:
                        Tile.dirtBottomLeftSpiderTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 48:
                        Tile.roundTreeCenter2Tile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 49:
                        Tile.roundTreeBottom2Tile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 50:
                        Tile.roundTreeBottom3Tile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 51:
                        Tile.roundTreeLeft2Tile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 52:
                        Tile.roundTreeLeft3Tile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 53:
                        Tile.roundTreeBottomLeft2Tile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 54:
                        Tile.treeBottomTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 55:
                        Tile.treeBottomRightTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 56:
                        Tile.treeLeftTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 57:
                        Tile.treeLeft2Tile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 58:
                        Tile.treeBottomRight2Tile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 59:
                        Tile.treeBottom2Tile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 60:
                        Tile.roundTreeBottomLeft3Tile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 61:
                        Tile.roundTreeBottom4Tile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 62:
                        Tile.treeRightTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 63:
                        Tile.treeBottom3Tile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 64:
                        Tile.treeBottomLeftTile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    case 65:
                        Tile.dirtBottomLeft2Tile.Draw(g, col * Tile.TILE_WIDTH, row * Tile.TILE_HEIGHT);
                        break;
                    default:
                        break;

                }
            }
        }
        entityManager.Draw(g);
    }

    public int getLevel() {
        return level;
    }

}
