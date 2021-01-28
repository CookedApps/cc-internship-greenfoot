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
    Wall[] wallarr = new Wall[20];
    int posx = 1140;
    int posy = 786;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(1200, 800, 1); 
        setBackground("images/floor.png");
        mb1 = new messageBoard();
        addObject(mb1, 589, 94);
        Character character = new Character("X");
        addObject(character, 890, 600);
        endboss eb = new endboss();
        addObject(eb, 900, 180);
        spr = new soundPlayer();
        addObject(spr, 1140, 24);
        Friends frnd1 = new Friends();
        addObject(frnd1, 100, 700);
        //walls -----------------------------------------------
        setWallsSubline();
    }
    public void trumpMethod(){
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
        Wall wall10 = new Wall();
        
        wallarr[0] = wall;
        wallarr[1] = wall1;
        wallarr[2] = wall2;
        wallarr[3] = wall3;
        wallarr[4] = wall4;
        wallarr[5] = wall5;
        wallarr[6] = wall6;
        wallarr[7] = wall7;
        wallarr[8] = wall8;
        wallarr[9] = wall9;
        wallarr[10] = wall10;
    }
    public void setWallsSubline(){
        trumpMethod();
        
        
        for(int i =0; i < 10; i++){
            addObject(wallarr[i], posx, posy);
            posx = posx - 120;
        }
    }
    
}
