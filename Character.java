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
    int llr= 0;
    public Character(String myName){
        name = myName;
        setImage("images/man.png");
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
        // Add your action code here.
    }   
    public void walk(){
        llr = lr;
        if(Greenfoot.isKeyDown("right")){
            setRotation(0);
            move(5); 
            lr = 0;
        }
        if(Greenfoot.isKeyDown("left")){
            setRotation(0);
            move(-5); 
            lr = 1;
        }
        if(Greenfoot.isKeyDown("down")){
            setRotation(0);
            setLocation(getX(), getY()+5); 
            lr = 1;
        }
        if(Greenfoot.isKeyDown("up") && getY() > 400){
            setRotation(0);
            setLocation(getX(), getY()-5); 
            lr = 1;
        }
        if(lr == 0 && llr != 0){
            getImage().mirrorHorizontally();
        }
        else if(lr ==1 && llr != 1){
            getImage().mirrorHorizontally();
        }
    }
    public void talkWith(){
        System.out.println("here well have the talk with");
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
