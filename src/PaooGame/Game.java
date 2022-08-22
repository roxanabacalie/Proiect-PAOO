package PaooGame;

import PaooGame.GameWindow.GameWindow;
import PaooGame.Graphics.Assets;
import PaooGame.Tiles.Tile;

import java.awt.*;
import java.awt.image.BufferStrategy;

/*! \class Game
    \brief Clasa principala a intregului proiect. Implementeaza Game - Loop (Update -> Draw)

                ------------
                |           |
                |     ------------
    60 times/s  |     |  Update  |  -->{ actualizeaza variabile, stari, pozitii ale elementelor grafice etc.
        =       |     ------------
     16.7 ms    |           |
                |     ------------
                |     |   Draw   |  -->{ deseneaza totul pe ecran
                |     ------------
                |           |
                -------------
    Implementeaza interfata Runnable:

        public interface Runnable {
            public void run();
        }

    Interfata este utilizata pentru a crea un nou fir de executie avand ca argument clasa Game.
    Clasa Game trebuie sa aiba definita metoda "public void run()", metoda ce va fi apelata
    in noul thread(fir de executie). Mai multe explicatii veti primi la curs.

    In mod obisnuit aceasta clasa trebuie sa contina urmatoarele:
        - public Game();            //constructor
        - private void init();      //metoda privata de initializare
        - private void update();    //metoda privata de actualizare a elementelor jocului
        - private void draw();      //metoda privata de desenare a tablei de joc
        - public run();             //metoda publica ce va fi apelata de noul fir de executie
        - public synchronized void start(); //metoda publica de pornire a jocului
        - public synchronized void stop()   //metoda publica de oprire a jocului
 */
public class Game implements Runnable {
    private GameWindow wnd;        /*!< Fereastra in care se va desena tabla jocului*/
    private boolean runState;   /*!< Flag ce starea firului de executie.*/
    private Thread gameThread; /*!< Referinta catre thread-ul de update si draw al ferestrei*/


    //public EntityManager entityManager;
    private BufferStrategy bs;
    private Graphics g;


    //States
    private final State gameState;
    private final State menuState;

    //Input
    private final KeyHandler keyH;
    private final MouseManager mouseManager;

    private final Observer score;


    public State getGameState() {
        return gameState;
    }

    public State getState() {
        return State.getState();
    }

    public Game(String title, int width, int height) {
        wnd = new GameWindow(title, width, height);
        runState = false;
        keyH = new KeyHandler();
        mouseManager = new MouseManager();
        gameState = new GameState(this);
        score = new Score();
        gameState.registerObserver(score);
        menuState = MenuState.getInstance(this);
    }

    private void InitGame() {
        wnd = new GameWindow("Dinosaur Island", 1024, 768);
        wnd.BuildGameWindow();
        wnd.GetJFrame().addMouseListener(mouseManager);
        wnd.GetJFrame().addMouseMotionListener(mouseManager);
        wnd.GetCanvas().addMouseListener(mouseManager);
        wnd.GetCanvas().addMouseMotionListener(mouseManager);

        Assets.Init();

        State.setState(menuState);
    }


    public void run() {
        InitGame();
        long oldTime = System.nanoTime();   /*!< Retine timpul in nanosecunde aferent frame-ului anterior.*/
        long curentTime;                    /*!< Retine timpul curent de executie.*/

        /// Apelul functiilor Update() & Draw() trebuie realizat la fiecare 16.7 ms
        /// sau mai bine spus de 60 ori pe secunda.

        final int framesPerSecond = 200; /*!< Constanta intreaga initializata cu numarul de frame-uri pe secunda.*/
        final double timeFrame = 1000000000 / framesPerSecond; /*!< Durata unui frame in nanosecunde.*/

        /// Atat timp timp cat threadul este pornit Update() & Draw()
        while (runState) {
            /// Se obtine timpul curent
            curentTime = System.nanoTime();
            /// Daca diferenta de timp dintre curentTime si oldTime mai mare decat 16.6 ms
            if ((curentTime - oldTime) > timeFrame) {
                /// Actualizeaza pozitiile elementelor
                Update();
                /// Deseneaza elementele grafica in fereastra.
                Draw();
                oldTime = curentTime;
            }
        }

    }

    /*! \fn public synchronized void start()
        \brief Creaza si starteaza firul separat de executie (thread).

        Metoda trebuie sa fie declarata synchronized pentru ca apelul acesteia sa fie semaforizat.
     */
    public synchronized void StartGame() {
        if (!runState) {
            /// Se actualizeaza flagul de stare a threadului
            runState = true;
            /// Se construieste threadul avand ca parametru obiectul Game. De retinut faptul ca Game class
            /// implementeaza interfata Runnable. Threadul creat va executa functia run() suprascrisa in clasa Game.
            gameThread = new Thread(this);
            /// Threadul creat este lansat in executie (va executa metoda run())
            gameThread.start();
        }

    }

    private void Update() {
        if (getState() == gameState) {
            wnd.GetJFrame().addKeyListener(keyH);
            wnd.GetCanvas().addKeyListener(keyH);
            keyH.Update();
        }

        if (State.getState() != null) {
            State.getState().Update();

        }

    }

    /*! \fn private void Draw()
        \brief Deseneaza elementele grafice in fereastra coresponzator starilor actualizate ale elementelor.

        Metoda este declarata privat deoarece trebuie apelata doar in metoda run()
     */
    private void Draw() {

        bs = wnd.GetCanvas().getBufferStrategy();
        if (bs == null) {
            try {
                wnd.GetCanvas().createBufferStrategy(3);
                return;
            } catch (Exception e) {
                /// Afisez informatii despre problema aparuta pentru depanare.
                e.printStackTrace();
            }
        }
        /// Se obtine contextul grafic curent in care se poate desena.
        g = bs.getDrawGraphics();
        /// Se sterge ce era
        g.clearRect(0, 0, wnd.GetWndWidth(), wnd.GetWndHeight());

        if (State.getState() != null) {
            State.getState().Draw(g);

        }

        bs.show();

        /// Elibereaza resursele de memorie aferente contextului grafic curent (zonele de memorie ocupate de
        /// elementele grafice ce au fost desenate pe canvas).
        g.dispose();
    }

    public Tile getTile(int x, int y) {
        int i = x / 32;

        int j = y / 32;
        int idd = 0;
        if (j < 24 && i < 32)
            idd = Tile.map.getMap(gameState.getLevel())[j][i];

        switch (idd) {
            case 0:
                return Tile.grassTile;
            case 1:
                return Tile.waterTopRightTile;
            case 2:
                return Tile.waterTile;
            case 3:
                return Tile.waterBottomLeft2Tile;
            case 4:
                return Tile.waterLeftTile;
            case 5:
                return Tile.roundTreeLeftTile;
            case 6:
                return Tile.roundTreeCenterTile;
            case 7:
                return Tile.roundTreeRightTile;
            case 8:
                return Tile.roundTreeTopLeftTile;
            case 9:
                return Tile.roundTreeTopTile;
            case 10:
                return Tile.roundTreeBottomLeftTile;
            case 11:
                return Tile.roundTreeBottomTile;
            case 12:
                return Tile.roundTreeBottomRightTile;
            case 13:
                return Tile.waterRightTile;
            case 14:
                return Tile.waterBottomTile;
            case 15:
                return Tile.waterBottomLeftTile;
            case 16:
                return Tile.grass2Tile;
            case 17:
                return Tile.waterBottomRight2Tile;
            case 18:
                return Tile.flowersTile;
            case 19:
                return Tile.waterTopLeftTile;
            case 20:
                return Tile.waterBottomRightTile;
            case 21:
                return Tile.waterTopRight2Tile;
            case 22:
                return Tile.waterTopLeft2Tile;
            case 23:
                return Tile.waterTopTile;
            case 24:
                return Tile.waterRocksLeftTile;
            case 25:
                return Tile.waterRocksTile;
            case 26:
                return Tile.waterRocksRightTile;
            case 27:
                return Tile.woodTopLeftTile;
            case 28:
                return Tile.woodTopRightTile;
            case 29:
                return Tile.woodLeftTile;
            case 30:
                return Tile.woodRightTile;
            case 31:
                return Tile.woodBottomLeftTile;
            case 32:
                return Tile.woodBottomRightTile;
            case 33:
                return Tile.dirtTopTile;
            case 34:
                return Tile.dirtBottomTile;
            case 35:
                return Tile.dirtTopRightTile;
            case 36:
                return Tile.dirtTopLeftTile;
            case 37:
                return Tile.dirtRightTile;
            case 38:
                return Tile.dirtLeftTile;
            case 39:
                return Tile.dirtCenterTile;
            case 40:
                return Tile.dirtBottomLeftTile;
            case 41:
                return Tile.dirtTopRight2;
            case 42:
                return Tile.dirtBottomRightSpiderTile;
            case 43:
                return Tile.dirtRightSpiderTile;
            case 44:
                return Tile.dirtCenterSpiderTile;
            case 45:
                return Tile.dirtLeftSpiderTile;
            case 46:
                return Tile.dirtTopSpiderTile;
            case 47:
                return Tile.dirtBottomLeftSpiderTile;
            case 48:
                return Tile.roundTreeCenter2Tile;
            case 49:
                return Tile.roundTreeBottom2Tile;
            case 50:
                return Tile.roundTreeBottom3Tile;
            case 51:
                return Tile.roundTreeLeft2Tile;
            case 52:
                return Tile.roundTreeLeft3Tile;
            case 53:
                return Tile.roundTreeBottomLeft2Tile;
            case 54:
                return Tile.treeBottomTile;
            case 55:
                return Tile.treeBottomRightTile;
            case 56:
                return Tile.treeLeftTile;
            case 57:
                return Tile.treeLeft2Tile;
            case 58:
                return Tile.treeBottomRight2Tile;
            case 59:
                return Tile.treeBottom2Tile;
            case 60:
                return Tile.roundTreeBottomLeft3Tile;
            case 61:
                return Tile.roundTreeBottom4Tile;
            case 62:
                return Tile.treeRightTile;
            case 63:
                return Tile.treeBottom3Tile;
            case 64:
                return Tile.treeBottomLeftTile;
            case 65:
                return Tile.dirtBottomLeft2Tile;
            default:
                return Tile.grassTile;
        }
    }

    public KeyHandler getKeyHandler() {
        return keyH;
    }

    public MouseManager getMouseManager() {
        return mouseManager;
    }

    public State getMenuState() {
        return menuState;
    }

    public Graphics getG() {
        return g;
    }

}

