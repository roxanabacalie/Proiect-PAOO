package PaooGame;

import PaooGame.Graphics.Assets;

import java.awt.Graphics;

import static PaooGame.Graphics.Assets.helpMenu;

public class MenuState extends State {

    private final UIManager uiManager;
    private boolean help;
    private static MenuState menuState;

    private MenuState(Game game) {
        super(game);
        uiManager = new UIManager(game);
        game.getMouseManager().setUIManager(uiManager);
        help = false;

        uiManager.addObject(new UIImageButton(380, 100, 264, 128, Assets.btn_start, new ClickListener() {
            @Override
            public void onClick() {

                State.setState(game.getGameState());
            }


        }));

        uiManager.addObject(new UIImageButton(380, 300, 264, 128, Assets.btn_help, new ClickListener() {
            @Override
            public void onClick() {
                help = !help;
            }


        }));

        uiManager.addObject(new UIImageButton(380, 500, 264, 128, Assets.btn_quit, new ClickListener() {
            @Override
            public void onClick() {
                Runtime.getRuntime().exit(0);
            }


        }));
    }

    public static MenuState getInstance(Game game) {
        if (menuState == null) {
            menuState = new MenuState(game);
        }

        return menuState;

    }

    @Override
    public void Update() {
        uiManager.Update();
    }

    @Override
    public void Draw(Graphics g) {

        if (help) {
            game.getG().drawImage(helpMenu, 0, 0, 300, 300, null);
        }
        uiManager.Draw(g);
    }

    @Override
    public void registerObserver(Observer score) {

    }

    @Override
    public int getLevel() {
        return 0;
    }

}