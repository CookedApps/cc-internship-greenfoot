import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Character character = new Character();
    messageBoard msgBoard = new messageBoard();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(1200, 800, 1); 
        messageBoard mb1 = new messageBoard();
        mb1.setVisible = true, mb1.setLocation(10,20);
    }
    public void characterActions(){
        character.talkWith();
    }
}
