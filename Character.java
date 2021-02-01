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
    boolean givenHW = false;
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
        giveHomework();
        // Add your action code here.
    }   
    public void walk(){
        llr = lr;
        if(Greenfoot.isKeyDown("d") | Greenfoot.isKeyDown("right")&& getX() < 1130){
            setRotation(0);
            move(5); 
            lr = 1;
        }
        if(Greenfoot.isKeyDown("a") | Greenfoot.isKeyDown("left") && getX() > 70){
            setRotation(0);
            move(-5); 
            lr = 0;
        }
        if(Greenfoot.isKeyDown("s") | Greenfoot.isKeyDown("down") && getY() < 705){
            setRotation(0);
            setLocation(getX(), getY()+5); 
            
        }
        if(Greenfoot.isKeyDown("w") | Greenfoot.isKeyDown("up") && getY() > 255){
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
        
            
            newHomework = MyWorld.frnd1.giveHomework();
            if(newHomework >=1){
               MyWorld.mb1.printOut("Copying Homework.....finished"); 
            }
            homework = homework + newHomework;
        }
    }
    public void readMessage(){
        MyWorld.mb1.printOut("This sign cant stop me because I cant read");
    }
    public void giveHomework(){
        if(Greenfoot.isKeyDown("g") && givenHW==false){
            if(homework > 0){
                homework = homework - 1;
                MyWorld.mb1.printOut("level geschafft - lol");
                if(homework == 0){
                    givenHW=true;
                }
            }
            else{
                MyWorld.mb1.printOut("Wo sind deine Hausaufgaben?");
            }
        }
    }
    public void runAway(){
        System.out.println("here we'll run away");
    }
    public void setLocation(int x, int y){
        if (getWorld().getObjectsAt(x, y, table.class).isEmpty() && getWorld().getObjectsAt(x, y, chair.class).isEmpty()){
            super.setLocation(x, y);
        }
    }
}
