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
    messageBoard mb1;
    int lr = 0;
    int llr = 0;
    int homework = 0;
    int newHomework = 0;
    public Character(String myName){
        name = myName;
        setImage("images/Sans.png");
        
    }
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //readMessage();
        //MyWorld.mb1.printOut("Hello, World");
        walk();
        talkWith();
        // Add your action code here.
    }   
    public void walk(){
        llr = lr;
        if(Greenfoot.isKeyDown("d") | Greenfoot.isKeyDown("right")){
            setRotation(0);
            move(5); 
            lr = 1;
        }
        if(Greenfoot.isKeyDown("a") | Greenfoot.isKeyDown("left")){
            setRotation(0);
            move(-5); 
            lr = 0;
        }
        if(Greenfoot.isKeyDown("s") | Greenfoot.isKeyDown("down")){
            setRotation(0);
            setLocation(getX(), getY()+5); 
            
        }
        if(Greenfoot.isKeyDown("w") | Greenfoot.isKeyDown("up")  && getY() > 255){
            setRotation(0);
            setLocation(getX(), getY()-5); 
            
        }
        if(lr == 0 && llr != 0){
            getImage().mirrorHorizontally();
        }
        else if(lr ==1 && llr != 1){
            getImage().mirrorHorizontally();
        }
    }
    public void talkWith(){
        if(Greenfoot.isKeyDown("h")){
        
            MyWorld.mb1.printOut("Copying Homework.....finished");
            newHomework = MyWorld.frnd1.giveHomework();
            homework = homework + newHomework;
        }
    }
    public void readMessage(){
        MyWorld.mb1.printOut("This sign cant stop me because I cant read");
    }
    public void attack(){
        System.out.println("here we'll attack");
    }
    public void runAway(){
        System.out.println("here we'll run away");
    }
}
