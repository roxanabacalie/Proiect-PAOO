package PaooGame.Graphics;

import java.awt.image.BufferedImage;

public class Assets {

    public static BufferedImage[] playerDown, playerUp, playerLeft, playerRight;
    public static BufferedImage[] dinosaurRight, dinosaurLeft;
    public static BufferedImage[] btn_start;
    public static BufferedImage[] btn_quit;
    public static BufferedImage[] btn_help;
    public static BufferedImage helpMenu;


    public static BufferedImage grass;
    public static BufferedImage grass2;
    public static BufferedImage flowers;


    public static BufferedImage water;
    public static BufferedImage waterTopRight;
    public static BufferedImage waterTopLeft;
    public static BufferedImage waterBottomRight;
    public static BufferedImage waterBottomLeft;
    public static BufferedImage waterTopRight2;
    public static BufferedImage waterTopLeft2;
    public static BufferedImage waterBottomRight2;
    public static BufferedImage waterBottomLeft2;
    public static BufferedImage waterRight;
    public static BufferedImage waterLeft;
    public static BufferedImage waterTop;
    public static BufferedImage waterBottom;
    public static BufferedImage waterRocksLeft;
    public static BufferedImage waterRocks;
    public static BufferedImage waterRocksRight;

    public static BufferedImage roundTreeLeft;
    public static BufferedImage roundTreeRight;
    public static BufferedImage roundTreeBottomLeft;
    public static BufferedImage roundTreeBottomRight;
    public static BufferedImage roundTreeTopLeft;
    public static BufferedImage roundTreeTop;
    public static BufferedImage roundTreeBottom;
    public static BufferedImage roundTreeCenter;

    public static BufferedImage roundTreeCenter2;
    public static BufferedImage roundTreeBottom2;
    public static BufferedImage roundTreeBottom3;
    public static BufferedImage roundTreeLeft2;
    public static BufferedImage roundTreeLeft3;
    public static BufferedImage roundTreeBottomLeft2;

    public static BufferedImage roundTreeBottomLeft3;
    public static BufferedImage roundTreeBottom4;


    public static BufferedImage treeLeft;
    public static BufferedImage treeLeft2;
    public static BufferedImage treeRight;
    public static BufferedImage treeBottom;
    public static BufferedImage treeBottom2;
    public static BufferedImage treeBottomRight;
    public static BufferedImage treeBottomRight2;
    public static BufferedImage treeBottom3;
    public static BufferedImage treeBottomLeft;


    public static BufferedImage woodTopLeft;
    public static BufferedImage woodTopRight;
    public static BufferedImage woodLeft;
    public static BufferedImage woodRight;
    public static BufferedImage woodBottomLeft;
    public static BufferedImage woodBottomRight;


    public static BufferedImage dirtTop;
    public static BufferedImage dirtBottom;
    public static BufferedImage dirtTopRight;
    public static BufferedImage dirtTopLeft;
    public static BufferedImage dirtRight;
    public static BufferedImage dirtLeft;
    public static BufferedImage dirtCenter;

    public static BufferedImage dirtBottomLeft;
    public static BufferedImage dirtTopRight2;
    public static BufferedImage dirtBottomRightSpider;
    public static BufferedImage dirtRightSpider;
    public static BufferedImage dirtCenterSpider;
    public static BufferedImage dirtLeftSpider;
    public static BufferedImage dirtTopSpider;
    public static BufferedImage dirtBottomLeftSpider;
    public static BufferedImage dirtBottomLeft2;


    public static BufferedImage rope;
    public static BufferedImage tool1;
    public static BufferedImage tool2;
    public static BufferedImage tool3;
    public static BufferedImage tool4;
    public static BufferedImage tool5;
    public static BufferedImage knife;


    public static void Init() {

        SpriteSheet sheet = new SpriteSheet(ImageLoader.LoadImage("/textures/hartajoc1.png"));
        SpriteSheet sheet2 = new SpriteSheet(ImageLoader.LoadImage("/textures/hartajoc2.png"));
        SpriteSheet sheet3 = new SpriteSheet(ImageLoader.LoadImage("/textures/hartajoc3.png"));

        SpriteSheet sheetPlayerDown = new SpriteSheet(ImageLoader.LoadImage("/textures/JuliaDown.png"));
        SpriteSheet sheetPlayerUp = new SpriteSheet(ImageLoader.LoadImage("/textures/JuliaUp.png"));
        SpriteSheet sheetPlayerLeft = new SpriteSheet(ImageLoader.LoadImage("/textures/JuliaLeft.png"));
        SpriteSheet sheetPlayerRight = new SpriteSheet(ImageLoader.LoadImage("/textures/JuliaRight.png"));

        SpriteSheet sheetDinosaurRight = new SpriteSheet(ImageLoader.LoadImage("/textures/Dinosaur.png"));
        SpriteSheet sheetDinosaurLeft = new SpriteSheet(ImageLoader.LoadImage("/textures/DinosaurLeft.png"));

        SpriteSheet sheetRope = new SpriteSheet(ImageLoader.LoadImage("/textures/Rope.png"));
        SpriteSheet sheetTool1 = new SpriteSheet(ImageLoader.LoadImage("/textures/Tool1.png"));
        SpriteSheet sheetTool2 = new SpriteSheet(ImageLoader.LoadImage("/textures/Tool2.png"));
        SpriteSheet sheetTool3 = new SpriteSheet(ImageLoader.LoadImage("/textures/Tool3.png"));
        SpriteSheet sheetTool4 = new SpriteSheet(ImageLoader.LoadImage("/textures/Tool4.png"));
        SpriteSheet sheetTool5 = new SpriteSheet(ImageLoader.LoadImage("/textures/Tool5.png"));
        SpriteSheet sheetKnife = new SpriteSheet(ImageLoader.LoadImage("/textures/Knife.png"));

        SpriteSheet sheetStart1 = new SpriteSheet(ImageLoader.LoadImage("/textures/start1.png"));
        SpriteSheet sheetStart2 = new SpriteSheet(ImageLoader.LoadImage("/textures/start2.png"));
        SpriteSheet sheetQuit1 = new SpriteSheet(ImageLoader.LoadImage("/textures/quit1.png"));
        SpriteSheet sheetQuit2 = new SpriteSheet(ImageLoader.LoadImage("/textures/quit2.png"));
        SpriteSheet sheetHelp1 = new SpriteSheet(ImageLoader.LoadImage("/textures/help1.png"));
        SpriteSheet sheetHelp2 = new SpriteSheet(ImageLoader.LoadImage("/textures/help2.png"));
        SpriteSheet sheetHelpMenu = new SpriteSheet(ImageLoader.LoadImage("/textures/helpmenu.png"));


        helpMenu = sheetHelpMenu.crop4();

        btn_start = new BufferedImage[2];
        btn_start[0] = sheetStart1.crop3(0, 0);
        btn_start[1] = sheetStart2.crop3(0, 0);

        btn_quit = new BufferedImage[2];
        btn_quit[0] = sheetQuit1.crop3(0, 0);
        btn_quit[1] = sheetQuit2.crop3(0, 0);

        btn_help = new BufferedImage[2];
        btn_help[0] = sheetHelp1.crop3(0, 0);
        btn_help[1] = sheetHelp2.crop3(0, 0);


        rope = sheetRope.crop(0, 0);
        tool1 = sheetTool1.crop(0, 0);
        tool2 = sheetTool2.crop(0, 0);
        tool3 = sheetTool3.crop(0, 0);
        tool4 = sheetTool4.crop(0, 0);
        tool5 = sheetTool5.crop(0, 0);
        knife = sheetKnife.crop(0, 0);


        dinosaurLeft = new BufferedImage[8];
        dinosaurRight = new BufferedImage[8];
        dinosaurLeft[0] = sheetDinosaurLeft.crop2(0, 0);
        dinosaurLeft[1] = sheetDinosaurLeft.crop2(1, 0);
        dinosaurLeft[2] = sheetDinosaurLeft.crop2(2, 0);
        dinosaurLeft[3] = sheetDinosaurLeft.crop2(3, 0);
        dinosaurLeft[4] = sheetDinosaurLeft.crop2(4, 0);
        dinosaurLeft[5] = sheetDinosaurLeft.crop2(5, 0);
        dinosaurLeft[6] = sheetDinosaurLeft.crop2(6, 0);
        dinosaurLeft[7] = sheetDinosaurLeft.crop2(7, 0);

        dinosaurRight[0] = sheetDinosaurRight.crop2(0, 0);
        dinosaurRight[1] = sheetDinosaurRight.crop2(1, 0);
        dinosaurRight[2] = sheetDinosaurRight.crop2(2, 0);
        dinosaurRight[3] = sheetDinosaurRight.crop2(3, 0);
        dinosaurRight[4] = sheetDinosaurRight.crop2(4, 0);
        dinosaurRight[5] = sheetDinosaurRight.crop2(5, 0);
        dinosaurRight[6] = sheetDinosaurRight.crop2(6, 0);
        dinosaurRight[7] = sheetDinosaurRight.crop2(7, 0);


        playerDown = new BufferedImage[4];
        playerUp = new BufferedImage[4];
        playerLeft = new BufferedImage[4];
        playerRight = new BufferedImage[4];

        playerDown[0] = sheetPlayerDown.crop(0, 0);
        playerDown[1] = sheetPlayerDown.crop(1, 0);
        playerDown[2] = sheetPlayerDown.crop(2, 0);
        playerDown[3] = sheetPlayerDown.crop(3, 0);

        playerLeft[0] = sheetPlayerLeft.crop(0, 0);
        playerLeft[1] = sheetPlayerLeft.crop(1, 0);
        playerLeft[2] = sheetPlayerLeft.crop(2, 0);
        playerLeft[3] = sheetPlayerLeft.crop(3, 0);

        playerUp[0] = sheetPlayerUp.crop(0, 0);
        playerUp[1] = sheetPlayerUp.crop(1, 0);
        playerUp[2] = sheetPlayerUp.crop(2, 0);
        playerUp[3] = sheetPlayerUp.crop(3, 0);

        playerRight[0] = sheetPlayerRight.crop(0, 0);
        playerRight[1] = sheetPlayerRight.crop(1, 0);
        playerRight[2] = sheetPlayerRight.crop(2, 0);
        playerRight[3] = sheetPlayerRight.crop(3, 0);


        grass = sheet.crop(6, 0);
        grass2 = sheet.crop(23, 2);
        flowers = sheet.crop(25, 4);


        water = sheet.crop(2, 0);
        waterTopRight = sheet.crop(0, 0);
        waterTopLeft2 = sheet.crop(2, 6);
        waterBottomLeft2 = sheet.crop(1, 0);
        waterBottomLeft = sheet.crop(6, 2);
        waterLeft = sheet.crop(5, 0);
        waterLeft = sheet.crop(5, 0);
        waterTopRight2 = sheet.crop(5, 2);
        waterRight = sheet.crop(2, 2);
        waterBottom = sheet.crop(0, 6);
        waterTopLeft = sheet.crop(6, 8);
        waterBottomRight = sheet.crop(2, 4);
        waterTop = sheet.crop(0, 7);
        waterBottomRight2 = sheet.crop(5, 5);
        waterRocksLeft = sheet.crop(3, 11);
        waterRocks = sheet.crop(4, 11);
        waterRocksRight = sheet.crop(5, 11);


        roundTreeLeft = sheet.crop(9, 0);
        roundTreeCenter = sheet.crop(10, 0);
        roundTreeRight = sheet.crop(11, 0);
        roundTreeTopLeft = sheet.crop(12, 0);
        roundTreeTop = sheet.crop(13, 0);
        roundTreeBottomLeft = sheet.crop(9, 1);
        roundTreeBottom = sheet.crop(10, 1);
        roundTreeBottomRight = sheet.crop(11, 1);

        roundTreeCenter2 = sheet.crop(31, 13);
        roundTreeBottom2 = sheet.crop(31, 20);
        roundTreeBottom3 = sheet.crop(31, 14);
        roundTreeLeft2 = sheet.crop(27, 22);
        roundTreeLeft3 = sheet.crop(23, 22);
        roundTreeBottomLeft2 = sheet.crop(30, 18);

        roundTreeBottomLeft3 = sheet2.crop(29, 1);
        roundTreeBottom4 = sheet2.crop(25, 1);


        treeBottom = sheet2.crop(0, 0);
        treeBottom2 = sheet2.crop(0, 8);
        treeBottomRight = sheet2.crop(1, 0);
        treeBottomRight2 = sheet2.crop(1, 3);
        treeLeft = sheet2.crop(5, 0);
        treeLeft2 = sheet2.crop(5, 1);
        treeRight = sheet2.crop(1, 4);
        treeBottom3 = sheet2.crop(3, 1);
        treeBottomLeft = sheet2.crop(3, 2);


        woodTopLeft = sheet.crop(10, 10);
        woodTopRight = sheet.crop(11, 10);
        woodLeft = sheet.crop(10, 11);
        woodRight = sheet.crop(11, 11);
        woodBottomLeft = sheet.crop(10, 12);
        woodBottomRight = sheet.crop(11, 12);


        dirtTop = sheet.crop(18, 18);
        dirtBottom = sheet.crop(18, 14);
        dirtTopRight = sheet.crop(15, 18);
        dirtTopLeft = sheet.crop(21, 18);
        dirtRight = sheet.crop(15, 16);
        dirtLeft = sheet.crop(21, 16);
        dirtCenter = sheet.crop(17, 16);

        dirtBottomLeft = sheet.crop(21, 14);
        dirtTopRight2 = sheet.crop(17, 14);
        dirtBottomRightSpider = sheet.crop(15, 12);
        dirtRightSpider = sheet.crop(15, 13);
        dirtCenterSpider = sheet.crop(16, 13);
        dirtLeftSpider = sheet.crop(17, 13);
        dirtTopSpider = sheet.crop(16, 12);
        dirtBottomLeftSpider = sheet.crop(17, 12);
        dirtBottomLeft2 = sheet3.crop(20, 8);
    }
}
