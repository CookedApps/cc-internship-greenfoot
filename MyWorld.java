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
        setBackground("images/floor.png");
        setWalls("sub");
        setWalls("right");
        setWalls("left");
        wall_class cls = new wall_class();
        addObject(cls, 600, 150);
        mb1 = new messageBoard();
        addObject(mb1, 589, 94);
        Character character = new Character("X");
        addObject(character, 890, 600);
        endboss eb = new endboss();
        addObject(eb, 53, 482);
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
            for(int i =0; i < 5; i++){
                trumpMethodRight();
                addObject(wallarrright[i], rposx, rposy);
                wallarrright[i].setRotation(-90);
                rposy = rposy - 120;
            }
        }
        else if(x == "left"){
            for(int i =0; i < 5; i++){
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
    public void trumpMethodLeft(){
        Wall wall20 = new Wall();
        Wall wall21 = new Wall();
        Wall wall22 = new Wall();
        Wall wall23 = new Wall();
        Wall wall24 = new Wall();
        Wall wall25 = new Wall();
        Wall wall26 = new Wall();
        Wall wall27 = new Wall();
        Wall wall28 = new Wall();
        Wall wall29 = new Wall();
        
        wallarrleft[0] = wall20;
        wallarrleft[1] = wall21;
        wallarrleft[2] = wall22;
        wallarrleft[3] = wall23;
        wallarrleft[4] = wall24;
        wallarrleft[5] = wall25;
        wallarrleft[6] = wall26;
        wallarrleft[7] = wall27;
        wallarrleft[8] = wall28;
        wallarrleft[9] = wall29;
    }
    public void trumpMethodRight(){
        Wall wall10 = new Wall();
        Wall wall11 = new Wall();
        Wall wall12 = new Wall();
        Wall wall13 = new Wall();
        Wall wall14 = new Wall();
        Wall wall15 = new Wall();
        Wall wall16 = new Wall();
        Wall wall17 = new Wall();
        Wall wall18 = new Wall();
        Wall wall19 = new Wall();
        
        wallarrright[0] = wall10;
        wallarrright[1] = wall11;
        wallarrright[2] = wall12;
        wallarrright[3] = wall13;
        wallarrright[4] = wall14;
        wallarrright[5] = wall15;
        wallarrright[6] = wall16;
        wallarrright[7] = wall17;
        wallarrright[8] = wall18;
        wallarrright[9] = wall19;
    } 
}
