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
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(1200, 800, 1); 
        setBackground("images/gras.jpg");
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
    }
}
