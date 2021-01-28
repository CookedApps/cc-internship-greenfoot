import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static messageBoard mb1;
    public static soundPlayer spr;
    public static Friends frnd1;
    public static Wall wall;
    Wall[] wallarrsub = new Wall[11];
    Wall[] wallarrright = new Wall[10];
    Wall[] wallarrleft = new Wall[10];
    int posx = 1140;
    int posy = 786;
    int rposx = 1200;
    int rposy = 800;
    int lposx = 0;
    int lposy = 800;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(1200, 800, 1); 
        setBackground("images/class_wall.jpg");
        setWalls("sub");
        setWalls("right");
        setWalls("left");
        Wall topLWall = new Wall();
        Wall topRWall = new Wall();
        addObject(topLWall, 0, 361 );
        addObject(topRWall, 1200, 361 );
        topLWall.setRotation(-90);
        topRWall.setRotation(-90);
        mb1 = new messageBoard();
        addObject(mb1, 589, 94);
        Character character = new Character("X");
        addObject(character, 1130, 705);
        //endboss eb = new endboss();
        //addObject(eb, 53, 482);
        enemy nolde = new enemy();
        addObject(nolde, 50, 500);
        nolde.name="nolde";
        nolde.setImg();
        spr = new soundPlayer();
        addObject(spr, 1140, 24);
        frnd1 = new Friends();
        addObject(frnd1, 100, 600);
        //walls -----------------------------------------------

    }
    public void setWalls(String x){
        if(x == "sub"){
            for(int i =0; i < 10; i++){
                trumpMethodsub();
                addObject(wallarrsub[i], posx, posy);
                posx = posx - 120;
            }
        }
        else if(x == "right"){
            for(int i =0; i < 4; i++){
                trumpMethodRight();
                addObject(wallarrright[i], rposx, rposy);
                wallarrright[i].setRotation(-90);
                rposy = rposy - 120;
            }
        }
        else if(x == "left"){
            for(int i =0; i < 4; i++){
                trumpMethodLeft();
                addObject(wallarrleft[i], lposx, lposy);
                wallarrleft[i].setRotation(-90);
                lposy = lposy - 120;
            }
        }
    }
    public void trumpMethodsub(){
        Wall wall = new Wall();
        Wall wall1 = new Wall();
        Wall wall2 = new Wall();
        Wall wall3 = new Wall();
        Wall wall4 = new Wall();
        Wall wall5 = new Wall();
        Wall wall6 = new Wall();
        Wall wall7 = new Wall();
        Wall wall8 = new Wall();
        Wall wall9 = new Wall();
        
        wallarrsub[0] = wall;
        wallarrsub[1] = wall1;
        wallarrsub[2] = wall2;
        wallarrsub[3] = wall3;
        wallarrsub[4] = wall4;
        wallarrsub[5] = wall5;
        wallarrsub[6] = wall6;
        wallarrsub[7] = wall7;
        wallarrsub[8] = wall8;
        wallarrsub[9] = wall9;
    }
    public void trumpMethodRight(){
        Wall wall10 = new Wall();
        Wall wall11 = new Wall();
        Wall wall12 = new Wall();
        Wall wall13 = new Wall();
        
        wallarrright[0] = wall10;
        wallarrright[1] = wall11;
        wallarrright[2] = wall12;
        wallarrright[3] = wall13;
    } 
    public void trumpMethodLeft(){
        Wall wall14 = new Wall();
        Wall wall15 = new Wall();
        Wall wall16 = new Wall();
        Wall wall17 = new Wall();

        wallarrleft[0] = wall14;
        wallarrleft[1] = wall15;
        wallarrleft[2] = wall16;
        wallarrleft[3] = wall17;
    }
    
}
