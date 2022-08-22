package PaooGame.Tiles;

import PaooGame.Map;

import java.awt.*;
import java.awt.image.BufferedImage;

/*! \class public class Tile
    \brief Retine toate dalele intr-un vector si ofera posibilitatea regasirii dupa un id.
 */
public class Tile {
    //private static final int NO_TILES   = 32;
    //public static Tile[] tiles          = new Tile[NO_TILES];       /*!< Vector de referinte de tipuri de dale.*/


    //asta e de fapt map 1 o sa schimb dupa ce implementez map2

    /// De remarcat ca urmatoarele dale sunt statice si publice. Acest lucru imi permite sa le am incarcate
    /// o singura data in memorie

    public static final int TILE_WIDTH = 32;                       /*!< Latimea unei dale.*/
    public static final int TILE_HEIGHT = 32;                       /*!< Inaltimea unei dale.*/
    public static Map map = new Map();
    public static Tile grassTile = new GrassTile(0);     /*!< Dala de tip iarba*/
    public static Tile waterTopRightTile = new WaterTopRightTile(1);
    public static Tile waterTile = new WaterTile(2);     /*!< Dala de tip apa*/
    public static Tile waterBottomLeft2Tile = new WaterBottomLeft2Tile(3);
    public static Tile waterLeftTile = new WaterLeftTile(4);
    public static Tile roundTreeLeftTile = new RoundTreeLeftTile(5);
    public static Tile roundTreeCenterTile = new RoundTreeCenterTile(6);
    public static Tile roundTreeRightTile = new RoundTreeRightTile(7);
    public static Tile roundTreeTopLeftTile = new RoundTreeTopLeftTile(8);
    public static Tile roundTreeTopTile = new RoundTreeTopTile(9);
    public static Tile roundTreeBottomLeftTile = new RoundTreeBottomLeftTile(10);
    public static Tile roundTreeBottomTile = new RoundTreeBottomTile(11);
    public static Tile roundTreeBottomRightTile = new RoundTreeBottomRightTile(12);
    public static Tile waterRightTile = new WaterRightTile(13);
    public static Tile waterBottomTile = new WaterBottomTile(14);
    public static Tile waterBottomLeftTile = new WaterBottomLeftTile(15);
    public static Tile grass2Tile = new Grass2Tile(16);
    public static Tile waterBottomRight2Tile = new WaterBottomRight2Tile(17);
    public static Tile flowersTile = new FlowersTile(18);
    public static Tile waterTopLeftTile = new WaterTopLeftTile(19);
    public static Tile waterBottomRightTile = new WaterBottomRightTile(20);
    public static Tile waterTopRight2Tile = new WaterTopRight2Tile(21);
    public static Tile waterTopLeft2Tile = new WaterTopLeft2Tile(22);
    public static Tile waterTopTile = new WaterTopTile(23);
    public static Tile waterRocksLeftTile = new WaterRocksLeftTile(24);
    public static Tile waterRocksTile = new WaterRocksTile(25);
    public static Tile waterRocksRightTile = new WaterRocksRightTile(26);
    public static Tile woodTopLeftTile = new WoodTopLeftTile(27);
    public static Tile woodTopRightTile = new WoodTopRightTile(28);
    public static Tile woodLeftTile = new WoodLeftTile(29);
    public static Tile woodRightTile = new WoodRightTile(30);
    public static Tile woodBottomLeftTile = new WoodBottomLeftTile(31);
    public static Tile woodBottomRightTile = new WoodBottomRightTile(32);
    public static Tile dirtTopTile = new DirtTopTile(33);
    public static Tile dirtBottomTile = new DirtBottomTile(34);
    public static Tile dirtTopRightTile = new DirtTopRightTile(35);
    public static Tile dirtTopLeftTile = new DirtTopLeftTile(36);
    public static Tile dirtRightTile = new DirtRightTile(37);
    public static Tile dirtLeftTile = new DirtLeftTile(38);
    public static Tile dirtCenterTile = new DirtCenterTile(39);
    public static Tile dirtBottomLeftTile = new DirtBottomLeftTile(40);
    public static Tile dirtTopRight2 = new DirtTopRight2Tile(41);
    public static Tile dirtBottomRightSpiderTile = new DirtBottomRightSpiderTile(42);
    public static Tile dirtRightSpiderTile = new DirtRightSpiderTile(43);
    public static Tile dirtCenterSpiderTile = new DirtCenterSpiderTile(44);
    public static Tile dirtLeftSpiderTile = new DirtLeftSpiderTile(45);
    public static Tile dirtTopSpiderTile = new DirtTopSpiderTile(46);
    public static Tile dirtBottomLeftSpiderTile = new DirtBottomLeftSpiderTile(47);
    public static Tile roundTreeCenter2Tile = new RoundTreeCenter2Tile(48);
    public static Tile roundTreeBottom2Tile = new RoundTreeBottom2Tile(49);
    public static Tile roundTreeBottom3Tile = new RoundTreeBottom3Tile(50);
    public static Tile roundTreeLeft2Tile = new RoundTreeLeft2Tile(51);
    public static Tile roundTreeLeft3Tile = new RoundTreeLeft3Tile(52);
    public static Tile roundTreeBottomLeft2Tile = new RoundTreeBottomLeft2Tile(53);
    public static Tile treeBottomTile = new TreeBottomTile(54);
    public static Tile treeBottomRightTile = new TreeBottomRightTile(55);
    public static Tile treeLeftTile = new TreeLeftTile(56);
    public static Tile treeLeft2Tile = new TreeLeft2Tile(57);
    public static Tile treeBottomRight2Tile = new TreeBottomRight2Tile(58);
    public static Tile treeBottom2Tile = new TreeBottom2Tile(59);
    public static Tile roundTreeBottomLeft3Tile = new RoundTreeBottomLeft3Tile(60);
    public static Tile roundTreeBottom4Tile = new RoundTreeBottom4Tile(61);
    public static Tile treeRightTile = new TreeRightTile(62);
    public static Tile treeBottom3Tile = new TreeBottom3Tile(63);
    public static Tile treeBottomLeftTile = new TreeBottomLeftTile(64);
    public static Tile dirtBottomLeft2Tile = new DirtBottomLeft2Tile(65);
    protected final int id;                                         /*!< Id-ul unic aferent tipului de dala.*/
    protected BufferedImage img;                                    /*!< Imaginea aferenta tipului de dala.*/
    //protected int type;

    /*! \fn public Tile(BufferedImage texture, int id)
        \brief Constructorul aferent clasei.

        \param image Imaginea corespunzatoare dalei.
        \param id Id-ul dalei.
     */
    public Tile(BufferedImage image, int idd) {
        img = image;
        id = idd;
    }


    /*! \fn public void Update()
        \brief Actualizeaza proprietatile dalei.
     */
    public void Update() {

    }

    /*! \fn public void Draw(Graphics g, int x, int y)
        \brief Deseneaza in fereastra dala.

        \param g Contextul grafic in care sa se realizeze desenarea
        \param x Coordonata x in cadrul ferestrei unde sa fie desenata dala
        \param y Coordonata y in cadrul ferestrei unde sa fie desenata dala
     */
    public void Draw(Graphics g, int x, int y) {
        /// Desenare dala
        g.drawImage(img, x, y, TILE_WIDTH, TILE_HEIGHT, null);
    }

    /*! \fn public boolean IsSolid()
        \brief Returneaza proprietatea de dala solida (supusa coliziunilor) sau nu.
     */
    public boolean IsSolid() {
        return (this.id >= 5 && this.id <= 6) || (this.id >= 48 && this.id <= 53) || (this.id == 29 || this.id == 31) || (this.id == 56 || this.id == 62 || this.id == 58 || this.id == 57 || this.id == 54 || this.id == 55);
    }

    /*! \fn public int GetId()
        \brief Returneaza id-ul dalei.
     */
    public int GetId() {
        return id;
    }

}
