import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{   
    String name;
    //messageBoard mb1;
    public Character(String myName){
        name = myName;
        setImage("images/man.png");
    }
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(messageBoard mb1) 
    {
        readMessage();
        
        // Add your action code here.
    }   
    public void walk(){
        System.out.println("here well walk");
    }
    public void talkWith(){
        System.out.println("here well have the talk with");
    }
    public void readMessage(){
        mb1.printOut("This sign cant stop me because I cant read");
    }
    public void attack(){
        System.out.println("here we'll attack");
    }
    public void runAway(){
        System.out.println("here we'll run away");
    }
}
